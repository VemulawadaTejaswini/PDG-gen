import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        int[] problems = new int[N];
        for (int i = 0; i < N; i++) {
            problems[i] = 1;
        }
        for (int i = 0; i < M; i++) {
            int prob = in.nextInt()-1;
            String result = in.next();
            if (result.equals("AC") && problems[prob] > 0) {
                problems[prob] = (problems[prob] * -1);
            }
            else if (result.equals("WA") && problems[prob] > 0){
                problems[prob]++;
            }
        }

        int correct = 0;
        int penalty = 0;
        for (int i = 0; i < N; i++) {
            if (problems[i] < 0) {
                correct++;
            }
            if (problems[i] < 0) {
                problems[i]++;
                penalty += (problems[i]*-1);
            }
        }
        System.out.println(correct + " " + penalty);
    }
}
