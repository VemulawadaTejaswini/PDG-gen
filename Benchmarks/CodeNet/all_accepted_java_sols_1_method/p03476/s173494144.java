import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        int N = 101010;
        int [] is_prime = new int [N+1];

        for (int i = 2; i <= N; i++) is_prime[i] = 1;

        for (int i = 2; i <= N; i++) {
            if (is_prime[i] == 1) {
                for (int k = 2; i*k <= N; k++ ) is_prime[i*k] = 0;
            }
        }

        int [] a = new int [N];
        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) continue; 
            if (is_prime[i] == 1 && is_prime[(i+1)/2] == 1 ) a[i] = 1;
        }

        int [] s = new int [N+1];
        for (int i = 0; i < N; i++) s[i+1] = s[i] + a[i];

        int Q = sc.nextInt();
        for (int q = 0; q < Q; q++) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            System.out.println(s[r+1] - s[l]);
        }
    }
}