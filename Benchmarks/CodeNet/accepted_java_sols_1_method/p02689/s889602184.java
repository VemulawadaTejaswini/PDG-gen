import java.util.*;
import java.io.*;

public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   
        int m = sc.nextInt();   
        int[] h = new int[n];
        int a;
        int b;
        int[] good = new int[n];
        for (int i = 0; i < n; i++) {
            good[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            a--; b--;
            if (h[a] < h[b]) {
                good[a] = -1;
            } else if (h[a] > h[b]) {
                good[b] = -1;
            } else if (h[a] == h[b]) {
                good[a] = -1;
                good[b] = -1;
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (good[i] == 0) res++;
        }
        System.out.println(res);   
    }
}