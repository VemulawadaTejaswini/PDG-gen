import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
    static final int INF = 1000000000;         
    static int cmps = 0;
    
    public static void main(String[] args) throws Exception {                
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; ++i) a[i] = input.nextInt();
        int[] b = new int[11111];
        Arrays.fill(b, 0);
        for (int i = 0; i < n; ++i) ++b[a[i]];
        for (int i = 1; i < 11111; ++i) b[i] += b[i - 1];
        int[] res = new int[n + 1];
        for (int i = 0; i < n; ++i) res[b[a[i]]--] = a[i];
        System.out.print(res[1]);
        for (int i = 2; i <= n; ++i) System.out.print(" " + res[i]);
        System.out.println("");
    }              
}