import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = n; i >= 1; i--) {
            int num = i;
            int sum = 0;
            for (int j = i * 2; j <= n; j += i) {
                sum += b[j - 1];
            }
            
            if (a[i - 1] != sum % 2) {
                count++;
                b[i - 1] = 1;
            }
        }
        
        System.out.println(count);
        for (int i = 1; i <= n; i++) {
            if (b[i - 1] == 1) {
                System.out.println(i);
            }
        }
    }
}
