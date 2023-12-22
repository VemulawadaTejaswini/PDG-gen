import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();


        System.out.print(a.substring(0, 1) + b.substring(0, 1) + c.substring(0, 1));
    }
}
