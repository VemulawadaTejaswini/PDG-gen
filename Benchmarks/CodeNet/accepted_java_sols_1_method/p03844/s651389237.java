import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int A = in.nextInt();
            String op = in.next();
            int B = in.nextInt();
            System.out.println(op.equals("+") ? A + B : (A - B));
        }
    }
}
