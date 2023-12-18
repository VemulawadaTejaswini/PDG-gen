import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        int index = k - 1;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }
        int max = sum;
        
        
        for (int i = k; i < n; i++) {
            sum -= array[i - k];
            sum += array[i];
            if (sum > max) {
                max = sum;
                index = i;
            }
        }
        
        double ans = 0;
        for (int i = index; i > index - k; i--) {
            ans += ((((double)array[i])+1) / 2);
        }
        
        System.out.println(ans);
    }
}
