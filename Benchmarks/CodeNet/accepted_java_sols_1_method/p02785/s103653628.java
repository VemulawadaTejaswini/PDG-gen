import java.util.*;
import java.io.*;
import java.math.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Integer[] h = new Integer[n];
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
        }
        Arrays.sort(h,Collections.reverseOrder());
        long ans = 0;
        for(int i = k; i < n; i++){
            ans += h[i];
        }
        System.out.println(ans);
    }
}
 