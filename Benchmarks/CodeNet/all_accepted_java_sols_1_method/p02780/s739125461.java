import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            array[i] = (double)(num + 1) / 2;
            
        }
        
        double nowsum = 0;
        for (int i = 0; i < k; i++) {
            nowsum += array[i];
        }
        
        double max = nowsum;
        for (int i = 1; i < n - k + 1; i++) {
            nowsum -= array[i - 1];
            nowsum += array[i - 1 + k];
            max = Math.max(max, nowsum);
        }
        
        
        System.out.println(max);
    }
}
