import java.util.Scanner;

public class Main {
    int D;
    int D1;
    int[] C;
    int[][] S;
    long score;

//    int[] bestContestOfDay;
    

    // スケジュール
    int[] schedule;

    private void debugPrint() {
        for (int i = 1; i <= 26; i++) {
            System.out.print(C[i] + " ");
        }
        System.out.println();

        for (int j = 1; j <= D; j++) {
            for (int i = 1; i <= 26; i++) {
                System.out.print(S[j][i] + " ");
            }
            System.out.println();
        }
    }

    private void init() {
        // read & init solution
        Scanner sc = new Scanner(System.in);
        D = sc.nextInt();
        D1 = D + 1;
        
        schedule = new int[D1];
        score = 0;

        C = new int[27];
        for (int i = 1; i <= 26; i++) {
            C[i] = sc.nextInt();
        }
        S = new int[D1][27];
        //bestContestOfDay = new int[D1];
        for (int j = 1; j <= D; j++) {
            int max = 0;
            for (int i = 1; i <= 26; i++) {
                S[j][i] = sc.nextInt();
                if (S[j][i] > max) {
                    max = S[j][i];
                    //bestContestOfDay[j] = i;
                    schedule[j] = i;
                }
                score += max;
            }
        }

        // minus score calc
    }

    private void output() {
        for (int i = 1; i <= D; i++) {
            System.out.println(schedule[i]);
        }
    }

    public void run() {
        init();

        output();
    }

    public static void main(String[] args) {
        (new Main()).run();
    }
}