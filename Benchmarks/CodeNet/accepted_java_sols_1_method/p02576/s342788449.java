
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.next());
        int x = Integer.parseInt(scan.next());
        int t = Integer.parseInt(scan.next());

        scan.close();

        System.out.println(((n + x - 1) / x) * t);
    }
}
