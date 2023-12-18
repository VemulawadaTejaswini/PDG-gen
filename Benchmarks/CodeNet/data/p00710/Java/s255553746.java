import java.awt.Label;
import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if(n == 0 && r == 0) break;
            int[] v = new int [n];
            for (int i = 0; i < n; i++) {
               v[i] = i+1; 
            }
            for (int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] bufp = new int[p];
                int[] bufc = new int[c];
                for (int j = 0; j < p-1; j++) {
                    bufp[j] = v[j+n-p+1]; 
                }
                for (int j = 0; j < c; j++) {
                    bufc[j] = v[n-p-c+1+j];
                }
                for (int j = 0; j < c; j++) {
                    v[j+n-c] = bufc[j];
                }
                for (int j = 0; j < p-1; j++) {
                    v[n-c-p+1+j] = bufp[j]; 
                }
            }
            System.out.println(v[n-1]);


        }

        sc.close();
    }
    
    public static void printary(int[] a)
    {
        for ( int i = 0; i < a.length; i++) {
            if(i>0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
