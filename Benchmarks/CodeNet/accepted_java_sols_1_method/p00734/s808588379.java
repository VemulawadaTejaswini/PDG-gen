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

            int t_ans = 101;
            int h_ans = 101;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (wa_tarou - tarou[i] + hanako[j] == wa_hanako - hanako[j] + tarou[i]) {
                        if (t_ans + h_ans >= tarou[i] + hanako[j]) {
                            t_ans = tarou[i];
                            h_ans = hanako[j];
                        }
                    }
                }
            }
            if (t_ans == 101 && h_ans == 101)
                System.out.println("-1");
            else
                System.out.println(t_ans + " " + h_ans);
        }
    }
}