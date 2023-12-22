import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = 100003;
        int[] prime = new int[n - 1];
        for (int i = 0; i < prime.length; i++) {
            prime[i] = 2 + i;
        }
        int k = 0;
        while (prime[k] <= Math.sqrt(n)) {
            if (prime[k] == 0) {
                k++;
                continue;
            }
            for (int i = k + 1; i < prime.length; i++) {
                if (prime[i] % prime[k] == 0) {
                    prime[i] = 0;
                }
            }
            k++;
        }
        for (int i = 0; i < prime.length; i++) {
            if (prime[i] >= x) {
                System.out.println(prime[i]);
                break;
            }
        }
        sc.close();
    }
}