import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] v = new int[n];
        int[] c = new int[n];
        for(int i = 0; i < n; i++) {
            v[i] = sc.nextInt();
        }
        int ans = 0;
        for(int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }

        boolean[] use = new boolean[n];


        while(true) {
            int id = -1;
            int max = 0;
            for(int i = 0; i < n; i++) {
                if(use[i]) continue;
                if(max < v[i] - c[i]) {
                    max = v[i] - c[i];
                    id = i;
                }
            }
            if(id == -1) break;
            use[id] = true;
            ans += max;
        }
        System.out.println(ans);




    } 
}