import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.next(); // AtCoder 固定値なので変数受けしない
        String s = scanner.next();
        scanner.close();

        System.out.println(String.format("A%cC", s.charAt(0)));
    }
}
