import java.util.Scanner;

/**
 * Created by dezhonger on 2019/4/13
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        long r = 0;
        if (a > b) {
            r += a;
            a--;

        } else {
            r+= b;
            b--;
        }
        r += Math.max(a, b);
        System.out.println(r);
    }
}
