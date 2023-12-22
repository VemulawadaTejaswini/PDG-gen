import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] li = new int[n];
        for(int i = 0; i < n; i++){
            li[i] = sc.nextInt();
        }
        long ans = Long.MAX_VALUE;
        for(int i = -100; i <= 100; i++){
            long tmp = 0;
            for(int j = 0; j < n; j++){
                tmp += Math.pow(Math.abs(i-li[j]),2);
            }
            ans = Math.min(ans,tmp);
        }
        System.out.println(ans);
    }
}