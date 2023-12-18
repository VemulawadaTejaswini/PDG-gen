/*
* Author. Silviase(@silviasetitech)
* For AtCoder
*/

import java.util.*;
import java.lang.*;
import java.math.*;


public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int[] ar = new int[4];
        for (int i = 0; i < 6; i++) {
            int j = sc.nextInt();
            ar[j-1]++;
        }
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < 4; i++) {
            if (ar[i] == 1) {
                count1++;
            }else if(ar[i] == 2) {
                count2++;
            }
        }
        if (count1 == 2 && count2 == 2) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


        sc.close();


    }
}