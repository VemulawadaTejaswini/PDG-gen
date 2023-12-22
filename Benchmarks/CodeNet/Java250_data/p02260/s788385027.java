import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;     
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = input.nextInt();
        int swaps = 0;
        for (int i = 0; i < n; ++i) {
            int min = i;
            for (int k = i; k < n; ++k) {
                if (a[k] < a[min]) min = k;
            }
            if (min != i) {
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
                ++swaps;
            }
        }
        System.out.print(a[0]);
        for (int i = 1; i < n; ++i) System.out.print(" " + a[i]);
        System.out.println("");
        System.out.println(swaps);
    }            
}