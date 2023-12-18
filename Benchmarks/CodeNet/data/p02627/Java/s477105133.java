
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        scan.close();

        if (a.charAt(0) <= 'Z') {
            System.out.println("A");
        } else {
            System.out.println("a");
        }

    }

}
