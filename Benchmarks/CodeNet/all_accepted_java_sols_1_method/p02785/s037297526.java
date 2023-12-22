import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] array = new int[n];
        
        long sum = 0;
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        
        long count = 0;
        
        Arrays.sort(array);
        
        if (k > n) {
            k = n;
        }
        for (int i = n - 1; i >= n - k; i--) {
            sum -= array[i];
        }
        
        
        
        if (sum < 0) {
            System.out.println(0);
        } else {
            System.out.println(sum);
        }
    }
}
