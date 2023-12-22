import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        char[] ynArr = {'y','y','y','y','y','y','y','y','y','y'};
        for (int i = 0; i < k; i++) {
            ynArr[sc.nextInt()] = 'n';
        }

        int[] allowArr = new int[10 - k];
        int arrIdx = -1;
        for (int i = 0; i < 10; i++) {
            if (ynArr[i] == 'y') {
                allowArr[++arrIdx] = i;
            }
        }

        int[] values = {1, 10, 100, 1000, 10000};
        int[] degIndex = {0, -1, -1, -1, -1};

        while (true) {
            int cv = 0;
            for (int i = 0; i < 5; i++) {
                if (degIndex[i] == -1) break;
                cv += values[i] * allowArr[degIndex[i]];
            }
            if (n <= cv) {
                System.out.println(cv);
                break;
            }
            degIndex[0] += 1;
            for (int j = 0; j < 5; j++) {
                if (arrIdx < degIndex[j]) {
                    degIndex[j] = 0;
                    degIndex[j+1] += 1;
                } else {
                    break;
                }
            }
        }
    }
}
