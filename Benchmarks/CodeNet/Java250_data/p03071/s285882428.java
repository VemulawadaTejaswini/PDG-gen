import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A == B) {
            System.out.println(A * 2);
        } else {
            if (A < B) {
                int temp = B;
                B = A;
                A = temp;
            }
            System.out.println((A - 1) + A);
        }
    }
}
