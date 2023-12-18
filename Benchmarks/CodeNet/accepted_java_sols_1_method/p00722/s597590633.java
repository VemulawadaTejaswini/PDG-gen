import java.util.*;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] primes = new boolean[1000000];
        primes[0] = true;
        primes[1] = true;
        for (int i = 2; i < primes.length; i++) {
            if (primes[i]) {
                continue;
            }
            for (int j = 2; j * i < primes.length; j++) {
                primes[i * j] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(true) {
            int a = sc.nextInt();
            int d = sc.nextInt();
            int n = sc.nextInt();
            if (a == 0 && d == 0 && n == 0) {
                break;
            }
            int count = 0;
            int value = 0;
            for (int i = 0; count < n && a + d * i < 1000000; i++) {
                if (!primes[a + d * i]) {
                    count++;
                    value = a + d * i;
                }
            }
            sb.append(value).append("\n");
        }
        System.out.print(sb);
    }
}
