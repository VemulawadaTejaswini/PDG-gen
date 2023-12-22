import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tmp = n;
        while (tmp >= 0) {
            if (tmp % 7 == 0) {
                System.out.println("Yes");
                return;
            }
            tmp -= 4;
        }
        tmp = n;
        while (tmp >= 0) {
            if (tmp % 4 == 0) {
                System.out.println("Yes");
                return;
            }
            tmp -= 7;
        }
        System.out.println("No");
    }
}
