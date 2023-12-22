import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for (int i = 1; i <= 9; i++) {
            if (N % i == 0 && N / i >= 1 && N / i <= 9) {
                System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}
