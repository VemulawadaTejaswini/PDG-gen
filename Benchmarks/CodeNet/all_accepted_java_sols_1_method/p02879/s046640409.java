import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (A >= 1 && A <= 9 && B >= 1 && B <= 9) {
            System.out.println(A * B);
        } else {
            System.out.println(-1);
        }
    }
}
