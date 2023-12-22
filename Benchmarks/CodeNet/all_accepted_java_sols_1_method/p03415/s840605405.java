import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String c1 = scan.next();
        String c2 = scan.next();
        String c3 = scan.next();
        System.out.println("" + c1.charAt(0) + c2.charAt(1) + c3.charAt(2));
    }
}
