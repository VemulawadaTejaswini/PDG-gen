
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        if (a == b && c == d || a == c && b == d || a == d && c == b) {
            System.out.println("yes");

        } else {
            System.out.println("no");
        }
    }
}

