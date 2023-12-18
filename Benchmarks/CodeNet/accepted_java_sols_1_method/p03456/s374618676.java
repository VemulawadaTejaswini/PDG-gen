
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = Integer.valueOf(String.valueOf(a) + String.valueOf(b));

        if ((int) Math.sqrt(c) == Math.sqrt(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

}
