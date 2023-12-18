import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 入力
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int m = sc.nextInt();

        // (9 * 60 + 0 - 12 * 0) / 720 = 540 / 720
        double rate = (h * 60 + m - 12 * m) / 720.0;
        if (rate > 0.5) {
            rate = 1.0 - rate;
        }
        double rad = 2 * Math.PI * rate;
        
        // c^2 = a^2 + b^2 - 2ab cos C
        double c2 = a * a + b * b - 2 * a * b * Math.cos(rad);
        double c = Math.sqrt(c2);

        System.out.println(c);
    }
}
