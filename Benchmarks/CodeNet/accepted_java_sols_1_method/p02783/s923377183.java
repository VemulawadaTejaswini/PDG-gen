import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // ABC153A - Serval vs Monster

        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int a = sc.nextInt();

        System.out.println((h / a) + ((h % a > 0) ? 1 : 0));
    }
}