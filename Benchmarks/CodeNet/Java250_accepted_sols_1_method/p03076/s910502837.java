import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int N = 5;

        //注文してから届くまでの時間
        int[] time = {A, B, C, D, E};
        //注文してから次に注文できるまでの時間
        int[] nextTime = new int[N];

        for (int i = 0; i < N; i++) {
            if (time[i] % 10 == 0) {
                nextTime[i] = time[i];
            } else {
                nextTime[i] = time[i] - time[i] % 10 + 10;
            }
        }

        int ans = 999999999;

        for (int i = 0; i < N; i++) {
            int sumTime = 0;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    //最後の処理
                    sumTime += time[j];
                } else {
                    sumTime += nextTime[j];
                }
            }
            ans = Math.min(ans, sumTime);
        }

        System.out.println(ans);


    }
}
