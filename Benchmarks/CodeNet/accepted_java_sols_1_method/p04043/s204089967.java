import java.util.Scanner;

/**
 * Created by zzt on 17-1-17.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        System.out.println(a*b*c==175&&a+b+c==17?"YES":"NO");
    }
}