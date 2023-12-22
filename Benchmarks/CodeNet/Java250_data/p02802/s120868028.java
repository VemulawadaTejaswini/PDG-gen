import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] p = new int[M];
        String[] S = new String[M];
        boolean[] judge = new boolean[N + 1];
        int correct = 0;
        int[] penalty = new int[N + 1];

        for (int i = 0; i < M; i++) {
            p[i] = sc.nextInt();
            S[i] = sc.next();
            if (judge[p[i]] != true) {
                if (S[i].equals("AC")) {
                    judge[p[i]] = true;
                    correct++;
                } else {
                    penalty[p[i]]++;
                }             
            }
        }

        int penaltySum = 0;
        boolean[] plusJudge = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            if (judge[p[i]] == false) {
                penalty[p[i]] = 0;
            }
            if (plusJudge[p[i]] == true) {
                continue;
            }
            penaltySum += penalty[p[i]];
            plusJudge[p[i]] = true;
        }

        System.out.println(correct + " " + penaltySum);
        
        sc.close();
    }
}