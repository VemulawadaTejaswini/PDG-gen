import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String ans = "";

        for (; ; ) {
            if (N / 26 < 26) {
                ans = ans + (char) (96 + N % 26);
            } else {
                ans = ans + "z";
            }

            if (N < 26) {
                break;
            }

            if (N / 26 < 27) {
                N = N - (26 * (N / 26));
            } else {
                N = N - 26 * 26;
                ans = ans + (char) (96 + N);
            }
        }

        ans = ans.replaceAll("[^a-z]", "");
        System.out.println(ans);
    }
}
