import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String k = sc.next();
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        System.out.println(k.equals("ARC") ? "ABC" : "ARC");

        sc.close();
    }
}