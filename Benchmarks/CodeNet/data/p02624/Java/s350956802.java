import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long ans = 0;

        for(int i=1;i<=n;i++) {
            long amari = n%i;
            long syou = n/i;
            
            ans+=(i+n-amari)*syou/2;
        }
        
        System.out.println(ans);
        
    }
}
