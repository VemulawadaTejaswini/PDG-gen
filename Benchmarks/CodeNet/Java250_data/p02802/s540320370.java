import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        final Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] problems = new int[N];
        int[] was = new int[N];

        for (int i = 0; i < M; i++) {
            final int p = sc.nextInt() - 1;
            boolean isAC = sc.next().equals("AC");
            if (isAC) {
                problems[p] = 1;
            } else {
                if (problems[p] != 1) {
                    was[p]++;
                }
            }
        }
        int wa = 0;
        for (int i = 0; i < N; i++) {
            if (problems[i] == 1) {
                wa += was[i];
            }
        }
        System.out.println(Arrays.stream(problems).sum() + " " +wa);
    }
}

