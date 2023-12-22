import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        
        if (k >= n || n == 1) {
            System.out.println(0);
            return;
        }
        
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        
        int[] d = new int[n - 1];
        int sum = 0;
        for (int i = 0; i < n - 1; i++) {
            d[i] = x[i + 1] - x[i];
            sum += d[i];
        }
        Arrays.sort(d);
        
        int answer = sum;
        for (int i = n - 2; i > n - 1 - k; i--) {
            answer -= d[i];
        }
        
        System.out.println(answer);
    }
}