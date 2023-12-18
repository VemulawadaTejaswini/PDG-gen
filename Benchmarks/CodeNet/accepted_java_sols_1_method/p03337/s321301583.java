import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        System.out.println(Math.max(Math.max(add, sub), mul));

    }
}