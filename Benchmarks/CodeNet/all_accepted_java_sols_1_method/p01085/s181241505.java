
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int nMin = scanner.nextInt();
        int nMax = scanner.nextInt();
        while (m != 0 && nMin != 0 && nMax != 0) {
            int score[] = new int[m];
            int maxGap = 0;
            int bestN = 0;
            
            for (int i = 0; i < m; ++i) {
                score[i] = scanner.nextInt();
            }

            for (int n = nMin; n <= nMax; n++) {
                int gap = score[n - 1] - score[n];
                if (maxGap <= gap) {
                    maxGap = gap;
                    bestN = n;
                }
            }

            System.out.println(bestN);

            m = scanner.nextInt();
            nMin = scanner.nextInt();
            nMax = scanner.nextInt();
        }
    }
}

