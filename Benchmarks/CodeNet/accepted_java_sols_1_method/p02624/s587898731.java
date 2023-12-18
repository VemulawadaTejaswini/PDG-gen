import java.util.*;
import java.util.function.*;
import java.lang.*;
import java.io.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        long ans = 0;
        for(int n=1; n<=N; n++){
            long num = N/n;
            /*n, 2n, 3n, ..., num*n == (1+num) * num / 2*/
            ans += n * (1+num) * num / 2;
        } 
        System.out.println(ans);
        
    }
}
