/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] rab = new int[n];
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            rab[i] = tmp-1;
        }
        for (int i = 0; i < n; i++) {
            if (rab[rab[i]] == i) {
                ans++;
            }
        }
        System.out.println(ans/2);

        sc.close();
    }

}