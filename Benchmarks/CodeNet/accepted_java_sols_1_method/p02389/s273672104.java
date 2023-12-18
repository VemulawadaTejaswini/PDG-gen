import java.util.Scanner;

/**
 * Created by hwzheng on 2016/12/13.
 */
public class Main {
    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = i * j;
        int l = (i + j) * 2;
        System.out.println(k + " " + l);
    }
}