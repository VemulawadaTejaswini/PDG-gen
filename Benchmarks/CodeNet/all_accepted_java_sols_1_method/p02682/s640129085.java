import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 入力
        int a = Integer.parseInt(sc.next()); // +1
        int b = Integer.parseInt(sc.next()); // 0
        int c = Integer.parseInt(sc.next()); // -1
        int k = Integer.parseInt(sc.next());

        // 出力
        int num = 0;
        int count = 0;
        outside: {
            for (int i = 0; i < a; i++) {
                if (count == k) {
                    break outside;
                }
                num++;
                count++;
            }
            for (int i = 0; i < b; i++) {
                if (count == k) {
                    break outside;
                }
                count++;
            }
            for (int i = 0; i < c; i++) {
                if (count == k) {
                    break outside;
                }
                num--;
                count++;
            }
        }
        System.out.println(num);
    }
}
