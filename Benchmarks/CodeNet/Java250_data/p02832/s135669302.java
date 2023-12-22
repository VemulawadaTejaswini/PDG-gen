import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextLong();
        }
        long ans = 0;
        long now = 1;
        for(int i = 0; i < n; i++){
            if(a[i] == now){
                now++;
            }else{
                ans++;
            }
        }
        if(ans == n){
            System.out.println(-1);
        }else{
            System.out.println(ans);
        }
    }
}

