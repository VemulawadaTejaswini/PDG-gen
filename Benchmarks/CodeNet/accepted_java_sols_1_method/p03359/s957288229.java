import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int a = sc.nextInt();
        // スペース区切りの整数の入力
        int b = sc.nextInt();
        int i = 0;

        if ((1 <= a && a <= 12) && (1 <= b && b <= 31)) {
            if (b < a) {
                i = a - 1;
                System.out.println(i);
            } else {
                i = a;
                System.out.println(i);
            }
        }
    }
}