import java.util.Scanner;

/**
 * @author yoshizaki
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        long s = scanner.nextLong();
        long ans = 0;
        ans += (s / 500) * 1000;
        s %= 500;
        ans += (s/5) * 5;
        System.out.println(ans);
    }

}
