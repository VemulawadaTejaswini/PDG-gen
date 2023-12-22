import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        double kaku = 0;
        for (int i=1; i<=N; i++) {
            int tokuten = i;
            double sunukeWin = (double)1/N;
            while (tokuten < K) {
                tokuten = tokuten * 2;
                sunukeWin = sunukeWin * 0.5;
            }
            kaku += sunukeWin;
        }

        System.out.println(kaku);
    }
}