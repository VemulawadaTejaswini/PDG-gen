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
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] ar = new int[m];
        for (int i = 0; i < m; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int[] dis = new int[m-1];
        for (int i = 0; i < dis.length; i++) {
            dis[i] = ar[i+1] - ar[i];
        }
        Arrays.sort(dis);
        int sum = 0;
        if (n >= m) {
            System.out.println(0);
        } else {
            for (int i = 0; i < m-n; i++) {
                sum += dis[i];
            }
            System.out.println(sum);
        }
        sc.close();
    }
}