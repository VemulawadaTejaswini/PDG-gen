import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner sc = new Scanner(System.in);

        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        if (A < 10 && B < 10) {
            System.out.print(A * B);
        } else {
            System.out.print(-1);
        }
    }
}