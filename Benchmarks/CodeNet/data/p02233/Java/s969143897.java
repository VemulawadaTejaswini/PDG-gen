import java.io.*;
import java.util.*;

public class Main {
    static int f[] = new int [45];
    
    public static int fib(int n){
        if (n == 0) return 1;
        if (n == 1) return 1;
        
        if (f[n-1] == 0){
            f[n-1] = fib(n-1);
        }
         if (f[n-2] == 0){
            f[n-2] = fib(n-2);
        }
        int ans = f[n-1] + f[n-2];
        
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int N = in.nextInt();
        
        System.out.println(fib(N));

    }
    
}