import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m4 = 0;
        int m2 = 0;
        int ot = 0;
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            if (a % 4 == 0) {
                m4++;
            } else if (a % 2 == 0) {
                m2++;
            } else {
                ot++;
            }
        }

        m4 -= ot;
        if (m4 <= -2) {
            System.out.println("No");
        } else if (m4 == -1 && m2 > 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
