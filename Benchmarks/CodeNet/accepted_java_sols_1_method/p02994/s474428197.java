import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int L = scanner.nextInt();

        int sum = 0;
        int[] appleScores = new int[N];
        for (int i=0; i < N; i++) {
            appleScores[i] = L + i;
            sum += appleScores[i];
        }

        int minAbsIndex = 0;
        int minAbs = Math.abs(appleScores[minAbsIndex]);
        for (int i=0; i < N; i++) {
            if (Math.abs(appleScores[i]) < minAbs) {
                minAbsIndex = i;
                minAbs = Math.abs(appleScores[minAbsIndex]);
            }
        }

        System.out.println(sum - appleScores[minAbsIndex]);
    }
}