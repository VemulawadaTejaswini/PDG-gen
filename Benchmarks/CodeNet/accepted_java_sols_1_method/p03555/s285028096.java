import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String r1 = scan.next();
        String r2 = scan.next();

        if (r1.charAt(0) == r2.charAt(2) &&
            r1.charAt(1) == r2.charAt(1) &&
            r1.charAt(2) == r2.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

