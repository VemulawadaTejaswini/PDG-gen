import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int d[] = new int[m];
        int t[] = new int[n+1];
        
        for (int i = 0; i < m; i++){
            d[i]=in.nextInt();
        }
        
        for (int i = 1; i <= n; i++){
            t[i]=Integer.MAX_VALUE;
        }
        t[0]=0;
        
        for(int i = 0; i < m; i++){
            for(int j = 0; j + d[i] <=n; j++){
                t[j + d[i]]=Math.min(t[j + d[i]],t[j]+1);
            }
        }
        
        System.out.println(t[n]);
    }  
}