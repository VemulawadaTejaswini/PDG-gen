import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            int B = in.nextInt();
            int res = 0;
            if (A <= B) {
                res += B;
                B--;
            } else {
                res += A;
                A--;
            }
            if (A <= B) {
                res += B;
                B--;
            } else {
                res += A;
                A--;
            }
            System.out.println(res);
        }
    }
}
