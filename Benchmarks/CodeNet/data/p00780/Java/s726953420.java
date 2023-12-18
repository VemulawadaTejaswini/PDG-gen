import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    int           MAX        = 32769;
    boolean       isPrime[] = new boolean[MAX];
    int           prime[]    = new int[MAX];
    List<Integer> primeList  = new ArrayList<Integer>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main m = new Main();
        m.calcPrime();
        while (true) {
            int ans = 0;
            int in = sc.nextInt();
            if (in == 0) {
                break;
            }
            for (int i = 2; i < in; i++) {
                if (m.isPrime[i]) {
                    int b = in - i;
                    if (i > b) {
                        break;
                    }
                    if (m.isPrime[b]) {
                        ans++;
                    }
                }
            }
            System.out.println(ans);
        }
    }

    public void calcPrime() {
        int p = 0;
        for (int i = 2; i < MAX; i++)
            isPrime[i] = true;
        for (int i = 2; i < MAX; i++) {
            if (isPrime[i]) {
                prime[p++] = i;
                for (int j = 2 * i; j < MAX; j += i)
                    isPrime[j] = false;
            }
        }
    }
}