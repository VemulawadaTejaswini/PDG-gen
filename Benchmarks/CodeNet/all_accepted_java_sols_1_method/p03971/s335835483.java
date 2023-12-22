import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());
        String S = sc.next();
        int AplusB = 0;
        int countB = 0;
        PrintWriter out = new PrintWriter(System.out);

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'a' && AplusB < (A + B)) {
                AplusB++;
                out.println("Yes");
                out.flush();
            } else if (S.charAt(i) == 'b' && AplusB < (A + B) && countB < B) {
                AplusB++;
                countB++;
                out.println("Yes");
                out.flush();
            } else {
                out.println("No");
                out.flush();
            }
        }

        sc.close();
    }
}