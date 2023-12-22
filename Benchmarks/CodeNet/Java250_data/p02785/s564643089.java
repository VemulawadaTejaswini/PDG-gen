import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long ans = 0;
        int h[] = new int[n]; 
        for(int i = 0; i < n; i++){
            h[i] = sc.nextInt();
            //System.out.println("a[i]"+a[i]);
        }
        Arrays.sort(h);
        for(int i = 0; i< n-k; i++){
            ans +=h[i];
        }
        System.out.println(ans);
    }
}