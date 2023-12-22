import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] scores = new int[N];
        boolean[] color = new boolean[8];
        int masterCnt = 0;

        for (int i = 0; i < 8; i++) {
            color[i] = false;
        }

        for (int i = 0; i < N; i++) {
            int score = sc.nextInt();

            if (score < 400) {
                color[0] = true;
            } else if (score < 800) {
                color[1] = true;
            } else if (score < 1200) {
                color[2] = true;
            } else if (score < 1600) {
                color[3] = true;
            } else if (score < 2000) {
                color[4] = true;
            } else if (score < 2400) {
                color[5] = true;
            } else if (score < 2800) {
                color[6] = true;
            } else if (score < 3200) {
                color[7] = true;
            } else if (score >= 3200) {
                masterCnt++;
            }
        }

        int cnt = 0;
        int ansMin;
        int ansMax;

        for (boolean bl : color) {
            if (bl)
                cnt++;
        }

        // System.out.println("DEBUG cnt:" + cnt);
        // System.out.println("DEBUG mscnt:" + masterCnt);

        if (cnt >= 1) {
            ansMin = cnt;
        } else {
            ansMin = 1;
        }

        ansMax = cnt + masterCnt;

        System.out.println(ansMin + " " + ansMax);
    }
}
