import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        String S = sc.next();

        int happy = 0;
        int blocks = 1;

        for (int i = 0; i < N; i++) {
            if (i > 0 && S.charAt(i) == 'L' && S.charAt(i - 1) == 'L') happy++;
            if (i < N - 1 && S.charAt(i) == 'R' && S.charAt(i + 1) == 'R') happy++;
            if (i > 0 && S.charAt(i) != S.charAt(i - 1)) blocks++;
        }

        if (K >= blocks / 2) {
            happy = N - 1;
        } else {
            happy += K * 2;
        }

        System.out.println(happy);
    }

}