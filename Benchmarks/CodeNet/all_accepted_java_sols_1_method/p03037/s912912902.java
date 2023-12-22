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

            int tmp = rList[0] - lList[lList.length - 1];

            if (tmp >= 0) {
                result += tmp + 1;
            }

            System.out.println(result);
        }
    }

}