import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        double w = stdIn.nextInt();
        double h = stdIn.nextInt();
        double x = stdIn.nextInt();
        double y = stdIn.nextInt();

        double ans = w * h / 2;
        System.out.println(ans);
        if (x == w / 2 && y == h / 2)
            System.out.println('1');
        else
            System.out.println('0');
    }
}
