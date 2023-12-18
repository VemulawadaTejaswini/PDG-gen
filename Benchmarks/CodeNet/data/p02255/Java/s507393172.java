import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static StringBuilder sb = new StringBuilder();

    public static void main(String... args) throws IOException {
        final int[] targetAry = load();

        insertionSort(targetAry);

        System.out.print(sb.toString());
    }

    public static int[] load() throws IOException {
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int n = Integer.parseInt(br.readLine());
        final String[] strNums = br.readLine().split(" ");
        final int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strNums[i]);
        }

        return nums;
    }

    public static void insertionSort(final int[] targetAry) {
        for (int i = 0; i < targetAry.length; i++) {
            sb.append(targetAry[i]).append(i != targetAry.length - 1 ? ' ' : '\n');
        }

        for (int i = 1; i < targetAry.length; i++) {
            for (int j = 0; j < i; j++) {
                if (targetAry[j] > targetAry[i]) {
                    swap(targetAry, j, i);
                }
            }
            for (int j = 0; j < targetAry.length; j++) {
                sb.append(targetAry[j]).append(j != targetAry.length - 1 ? ' ' : '\n');
            }
        }
    }

    public static void swap(final int[] targetAry, final int from, final int to) {
        final int tmp = targetAry[to];
        targetAry[to] = targetAry[from];
        targetAry[from] = tmp;
    }
}