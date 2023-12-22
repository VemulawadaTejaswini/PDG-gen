import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();

            long[][] x = new long[10][10];

            for (int i = 1; i <= N; i++) {
                String s = String.valueOf(i);
                Integer a = Integer.valueOf(s.substring(0, 1));
                Integer b = Integer.valueOf(s.substring(s.length() - 1, s.length()));
                x[a][b]++;
            }

            long ans = 0;

            for (int a = 1; a <= 9; a++) {
                for (int b = 1; b <= 9; b++) {
                    ans += x[a][b] * x[b][a];
                }
            }

            System.out.println(ans);
        }
    }

}
