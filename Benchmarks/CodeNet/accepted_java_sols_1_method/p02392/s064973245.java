import java.util.Scanner;

/**
 * Created by khrom on 2017/06/11.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("\\s");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < b && b < c)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}