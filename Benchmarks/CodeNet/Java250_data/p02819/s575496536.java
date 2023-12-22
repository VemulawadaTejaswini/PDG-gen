import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 0;; i++) {
            int tmp = x + i;
            if (sosu(tmp)) {
                System.out.println("" + tmp);
                break;
            }
        }
    }
    public static boolean sosu(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
}
