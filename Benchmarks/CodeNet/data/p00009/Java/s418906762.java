import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean[] primeList = createPrimeList();
        
        while (sc.hasNext()) {
            int n = Integer.parseInt(sc.next());
            int sum = 0;
            for (int i = 2; i <= n; i++) {
                if (primeList[i]) sum++;
            }
            System.out.println(sum);
        }
    }

    private static boolean[] createPrimeList() {
        int N = 1000000;

        boolean[] primeList = new boolean[N+1];
        Arrays.fill(primeList, true);

        for (int i = 2; i < Math.sqrt(N); i++) {
            if (!primeList[i]) continue;

            for (int j = 2; i * j <= N; j++) {
                primeList[i * j] = false;
            }
        }
        return primeList;
    }
}