import java.util.Scanner;

/**
 * Hanafuda
 */
public class Main{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (n == 0 && r == 0) {
                break;
            }

            int[] fuda = new int[n];
            for (int i = 0; i < n; i++) {
                fuda[i] = n - i;
            }

            for (int i = 0; i < r; i++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] shuffle1 = new int[p - 1];
                int[] shuffle2 = new int[c];
                for (int j = 0; j < shuffle1.length; j++) {
                    shuffle1[j] = fuda[j];
                }
                for (int j = 0; j < shuffle2.length; j++) {
                    shuffle2[j] = fuda[j + p - 1];
                }
                for (int j = 0; j < shuffle2.length; j++) {
                    fuda[j] = shuffle2[j];
                }
                for (int j = 0; j < shuffle1.length; j++) {
                    fuda[j + c] = shuffle1[j];
                }
            }

            System.out.println(fuda[0]);

        }
        sc.close();
    }
}
