import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        long[] count = new long[n+1];
        for (int i = 1; i <= 32; i++) {
            for (int j = 1; j <= 32; j++) {
                for (int k = 1; k <= 32; k++) {
                    int tmp = i * i + j * j + k * k + i * j + j * k + k * i;
                    
                    if (tmp <= n) {
                        count[tmp]++;
                    }
                }
            }
        }
        
        for (int i = 1; i <= n; i++) {
            System.out.println(count[i]);
        }
    }
}
