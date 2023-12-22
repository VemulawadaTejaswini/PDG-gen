import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N % 2 != 0) N *= 2;

        System.out.println(N);

    }
}
