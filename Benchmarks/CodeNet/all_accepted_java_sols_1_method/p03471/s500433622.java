import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sc.nextInt();
        
        for (int i = 0; i <= n; i++) {
            for (int j = 0; i + j <= n; j++) {
                int k = n - i - j;
                int tmp = 10000 * i + 5000 * j + 1000 * k;
                if (tmp == sum) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        
        System.out.println("-1 -1 -1");
    }
}