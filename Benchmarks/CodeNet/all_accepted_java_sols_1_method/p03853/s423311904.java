import java.util.Scanner;

/**
 * Created by zzt on 17-1-16.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int w = scanner.nextInt();

        scanner.nextLine();
        String[] s = new String[h];
        for (int i = 0; i < h; i++) {
            s[i] = scanner.nextLine();
        }

        for (int i = 0; i < h * 2; i++) {
            System.out.println(s[i/2]);
        }
    }
}
