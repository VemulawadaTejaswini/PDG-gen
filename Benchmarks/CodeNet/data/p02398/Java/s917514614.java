import java.util.Scanner;

/**
 * Created by khrom on 2017/06/14.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cnt = 0;
        for (int i = a; i < b; i++)
            if (c % i == 0 && i != c) cnt++;
        if (c == b) System.out.println("0");
        else System.out.println(cnt);
    }
}