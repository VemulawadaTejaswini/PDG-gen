
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        while (n != 0) {
            var tmp = n % 10;
            n /= 10;
            if (tmp == 7) {
                flag = true;
                break;
            }
        }

        if (flag) System.out.println("Yes");
        else System.out.println("No");
    }
}
