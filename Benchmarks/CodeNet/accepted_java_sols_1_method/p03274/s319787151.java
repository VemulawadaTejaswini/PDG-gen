import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
        int k = sc.nextInt();
 
        int array[] = new int[n];
 
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int ans = Integer.MAX_VALUE;
        k--;
     
        for (int i = 0; i < n - k; i++) {
            int r = Math.abs(array[i + k]) + Math.abs(array[i] - array[i + k]);
            int l = Math.abs(array[i]) + Math.abs(array[i + k] - array[i]);
            
            int min = Math.min(r,l);
            
            if (ans > min) ans = min;
        }
        
        System.out.println(ans);
 
        sc.close();
 
    }
 
}