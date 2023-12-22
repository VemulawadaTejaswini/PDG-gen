import java.util.*;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(s[i]);
        }
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            while (a[i]%2 == 0) {
                a[i] /= 2;
                count++;
            }
        }
        System.out.println(count);
    }
}



