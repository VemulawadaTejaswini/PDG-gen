import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        scanner.close();

        System.out.println(String.join(" ", A.split(",")));
    }
}
