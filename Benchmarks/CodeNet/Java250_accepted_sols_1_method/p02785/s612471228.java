import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] line = sc.nextLine().split(" ");

            int n = Integer.valueOf(line[0]);
            int k = Integer.valueOf(line[1]);

            int aCnt = n - k;

            long result = 0;
            if (aCnt <= 0) {
                System.out.println(result);
                return;
            }

            long[] dList = new long[n];

            for(int i=0;i<n;i++){
                dList[i] = sc.nextInt();
            }
            Arrays.sort(dList);

            for (int i = 0; i < aCnt; i++) {
                result += dList[i];
            }

            System.out.println(result);
        }
    }
}