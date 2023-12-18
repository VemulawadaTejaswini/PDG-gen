import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int H = scanner.nextInt();
        int W = scanner.nextInt();

        int yoko = N - W + 1;
        int tate = N - H + 1;

        System.out.println(yoko * tate);
    }

}
