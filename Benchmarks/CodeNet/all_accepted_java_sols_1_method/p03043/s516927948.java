import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        sc.close();

        // 確率
        double prob = 0.0;
        // サイコロが1からnの場合の各確率を求め、
        // それを合計したものが求めたい確率
        for (int i = 1; i <= n; i++) {
            int points = i;
            double diff = 1.0 / n;
            while (points < k) {
                diff *= 0.5;
                points *= 2;
            }
            prob += diff;
        }
        System.out.println(prob);
    }

}
