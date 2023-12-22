
import java.util.Scanner;

/**
 * Created by oka on 2018/06/23.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = String.valueOf(n);
        int s_n = 0;
        for (char c: str.toCharArray()) {
            s_n += Character.getNumericValue(c);
        }

        if (n % s_n == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
