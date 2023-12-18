import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inScanner = new Scanner(System.in);

        while (true) {
            int n = inScanner.nextInt();
            int m = inScanner.nextInt();

            if (n == 0 && m == 0) {
                break;
            }

            int[] tarou = new int[n];
            int[] hanako = new int[m];
            int wa_tarou = 0;
            int wa_hanako = 0;

            for (int i = 0; i < n; i++) {
                int tmp = inScanner.nextInt();
                tarou[i] = tmp;
                wa_tarou += tmp;
            }
            for (int i = 0; i < m; i++) {
                int tmp = inScanner.nextInt();
                hanako[i] = tmp;
                wa_hanako += tmp;
            }
            Arrays.sort(tarou);
            Arrays.sort(hanako);

            int sa = Math.abs(wa_hanako - wa_tarou);

            boolean breakout = false;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (Math.abs(tarou[i] - hanako[j]) *2 == sa) {
                        System.out.println(tarou[i] + " " + hanako[j]);
                        breakout = true;
                        break;
                    }
                }

                if (breakout) {
                    break;
                }
            }

            if (!breakout) {
                System.out.println("-1");
            }
        }
    }
}