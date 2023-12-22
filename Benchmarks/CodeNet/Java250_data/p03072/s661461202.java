import java.util.*;
import java.math.*;
import java.io.*;


public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for(int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        int num = 0;
        int max = -1;
        for(int i = 0; i < n; i++) {
            if(max <= h[i]) num++;
            max = Math.max(max,h[i]);
        }
        System.out.println(num);

    } 
}