import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        int M = Integer.parseInt(scanner.next());

        if (N >= M) {
            System.out.println(0);
            return;
        }

        int[] xArray = new int[M];
        for (int i = 0; i < M; i++) {
            int topX = Integer.parseInt(scanner.next());
            xArray[i] = topX;
        }
        scanner.close();

        Arrays.sort(xArray);

        Integer diffList[] = new Integer[M - 1];
        for (int i = 0; i < M - 1; i++) {
            int diff = Math.abs(xArray[i] - xArray[i + 1]);
            diffList[i] = diff;
        }

        Arrays.sort(diffList, Comparator.reverseOrder());

        for (int i = 0; i < N - 1; i++) {
            diffList[i] = 0;

            if (i == M - 1) {
                break;
            }
        }

        int sum = 0;
        for (int diff : diffList) {
            sum += diff;
        }

        System.out.println(sum);
    }
}
