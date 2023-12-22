import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] isNotPrimes = new boolean[123456 * 2 + 1];
        isNotPrimes[0] = true;
        isNotPrimes[1] = true;
        for (int i = 2; i < isNotPrimes.length; i++) {
            if (isNotPrimes[i]) {
                continue;
            }
            for (int j = 2; i * j < isNotPrimes.length; j++) {
                isNotPrimes[i * j] = true;
            }
        }
        int[] counts = new int[isNotPrimes.length];
        for (int i = 1; i < counts.length; i++) {
            counts[i] = counts[i - 1];
            if (!isNotPrimes[i]) {
                counts[i]++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while (true) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            }
            sb.append(counts[2 * x] - counts[x]).append("\n");
        }
        System.out.print(sb);
    }
}

