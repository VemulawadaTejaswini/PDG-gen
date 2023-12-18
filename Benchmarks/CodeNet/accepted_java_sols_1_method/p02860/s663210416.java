import java.util.Scanner;

/**
 * <p>ClassName:  </p>
 * <p>Description: </p>
 * <p>Company: </p>
 *
 * @author zhangyong
 * @version 1.0.0
 * @date 2019/10/22 7:40
 */
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        if (n % 2 != 0) {
            System.out.println("No");
            return;
        }
        for (int i = 0; i < n / 2; ++i) {
            if (str.charAt(i) != str.charAt(i + n / 2)) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}