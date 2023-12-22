import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int ans = Integer.MAX_VALUE;
        int n2 = (int)Math.pow(n, 0.5)+1;
        for(int i = 1; i < n2; i++){
            if(n % i == 0){
                ans = Math.min(ans,Math.max(String.valueOf(i).length(), String.valueOf(n/i).length()));
            }
        }
        System.out.println(ans);
    }
}