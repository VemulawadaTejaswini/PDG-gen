import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = sc.nextInt();
            int M = sc.nextInt();

            int[] lList = new int[M];
            int[] rList = new int[M];
            for (int i = 0; i < M; i++) {
                lList[i] = sc.nextInt();
                rList[i] = sc.nextInt();
            }

            Arrays.sort(lList);
            Arrays.sort(rList);

            int result = 0;

            for (int i = lList[lList.length - 1]; i <= rList[0]; i++) {
                result++;
            }

            System.out.println(result);
        }
    }

}