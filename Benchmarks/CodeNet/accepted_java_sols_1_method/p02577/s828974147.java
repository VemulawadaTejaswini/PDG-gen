
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] n = scan.next().split("");
        scan.close();

        long sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += Long.parseLong(n[i]);
        }

        if (sum % 9 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
