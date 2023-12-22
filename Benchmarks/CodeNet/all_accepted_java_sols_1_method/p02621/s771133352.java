import java.util.Scanner;

public class Main {

    public Main() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(N + N*N + N*N*N);
    }

    public static void main(String[] args) {
        new Main();
    }
}
