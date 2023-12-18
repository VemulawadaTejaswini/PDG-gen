import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        
        int min = 2000000000;
        for (int i = 0; i < n - (k - 1); i++) {
            int left = x[i];
            int right = x[i + k - 1];
            
            int length = Math.abs(left - right);
            int l = Math.abs(left);
            int r = Math.abs(right);
            if (l < r) {
                length += l;
            } else {
                length += r;
            }
            
            min = Math.min(min, length);
        }
        
        System.out.println(min);
    }
}