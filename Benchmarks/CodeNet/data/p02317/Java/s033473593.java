
/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=DPL_1_D
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static class LIS {

        int[] arr;

        public LIS(int[] arr) {
            this.arr = arr;
        }

        public int solve() {
            if (arr == null || arr.length == 0) {
                return 0;
            }
            int[] tailTable = new int[arr.length];
            tailTable[0] = arr[0];
            int len = 1;
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > tailTable[len - 1]) {
                    // Case 2. Clone and extend
                    tailTable[len++] = arr[i];
                } else if (arr[i] < tailTable[len - 1]) {
                    // Case 3. Clone, extend and discard
                    int insertionIdx = Arrays.binarySearch(tailTable, 0, len, arr[i]);
                    if (insertionIdx < 0) {
                        insertionIdx = -(insertionIdx + 1);
                    }
                    tailTable[insertionIdx] = arr[i];
                }
            }
            return len;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        LIS lis = new LIS(arr);
        System.out.println(lis.solve());
    }
}