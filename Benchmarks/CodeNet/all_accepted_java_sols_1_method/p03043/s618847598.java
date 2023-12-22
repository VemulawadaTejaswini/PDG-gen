import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = Integer.parseInt(s.next());
        int K = Integer.parseInt(s.next());

        double per = 0.0;

        for (int i = 1; i <= N; i++) {
            int num = i;
            double tmpPer = 1.0 / N;
            while (num < K) {
                num *= 2;
                tmpPer = tmpPer / 2;
            }
            per += tmpPer;
        }
        System.out.println(per);
    }
}
