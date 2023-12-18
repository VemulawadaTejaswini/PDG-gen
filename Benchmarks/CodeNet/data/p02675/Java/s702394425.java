// 提出時に消す


import java.util.Scanner;

// 提出時にMainに変更する
public class Main {
    public static void main(String[] args) throws Exception {
        // System.out.println("Hello Java");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double h = sc.nextDouble();
        double m = sc.nextDouble();

        double allmin = h * 60 + m;

        // ans^2 = a^2 + b^2 + 2ab * cos(Ans)
        double ans = Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(Math.toRadians(Math.abs((allmin / 2) - (m * 6)))));

        System.out.println(ans);
        sc.close();
    }
}