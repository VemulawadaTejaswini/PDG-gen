import java.util.Scanner;

/**
 * Created by zzt on 17-1-29.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();

        System.out.println(x<1200?"ABC":"ARC");
    }
}