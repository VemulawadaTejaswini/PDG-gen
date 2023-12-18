import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.next();

        char x = n.charAt(n.length() - 1);
        if (x == '3') {
            System.out.println("bon");
        } else if (x == '0' || x == '1' || x == '6' || x == '8') {
            System.out.println("pon");
        } else {
            System.out.println("hon");
        }
    }
}