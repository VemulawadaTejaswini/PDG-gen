import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Integer> rightAnswers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int penalty = 0;
        int correct = 0;
        int[] wrong = new int[n + 1];
        while (m-- > 0) {
            int p = sc.nextInt();
            String s = sc.next();
            if (wrong[p] == -1)
                continue;
            if (s.equals("WA"))
                wrong[p]++;
            else {
                correct++;
                penalty += wrong[p];
                wrong[p] = -1;
            }
        }
        System.out.println(correct + " " + penalty);
    }
}