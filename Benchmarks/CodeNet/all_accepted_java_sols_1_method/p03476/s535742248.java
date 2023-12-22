import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int MAX = 101010;

        // エラトステネスのふるい
        int[] isPrime = new int[MAX];
        for (int i = 0; i < MAX; i++) isPrime[i] = 1;
        isPrime[0] = 0;
        isPrime[1] = 0;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i] == 0) continue;
            for (int j = i*2; j < MAX; j += i) isPrime[j] = 0;
        }

        // 2017-like
        int[] a = new int[MAX];
        for (int i = 0; i < MAX; i++) {
            if (i % 2 == 0) continue;
            if ((isPrime[i] & isPrime[(i+1)/2]) == 1) a[i] = 1;
        }

        // 累積和
        int[] s = new int[MAX+1];
        for (int i = 0; i < MAX; i++) s[i+1] = s[i] + a[i];

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int l = Integer.parseInt(sc.next());
            int r = Integer.parseInt(sc.next());
            System.out.println(s[++r] - s[l]);
        }
    }
}
