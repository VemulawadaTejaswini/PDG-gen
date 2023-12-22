import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        if ((r * 100 + g * 10 + b) % 4 == 0) {
            // 出力
            System.out.println("YES");
        } else {
            // 出力
            System.out.println("NO");
        }

    }
}
