import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String... args) throws IOException {
        final int[] targetAry = load();

        insertionSort(targetAry);
    }

    public static int[] load() throws IOException {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }

        return nums;
    }

    public static void insertionSort(final int[] targetAry) {
        for (int i = 0; i < targetAry.length; i++) {
            for (int j = i; 0 < j; j--) {
                if (targetAry[j - 1] > targetAry[j]) {
                    swap(targetAry, j - 1, j);
                }
                if ((1 < j) && (targetAry[j - 1] > targetAry[j - 2])) {
                    break;
                }
            }

            print(targetAry);
        }
    }

    public static void swap(final int[] targetAry, final int from, final int to) {
        final int tmp = targetAry[to];
        targetAry[to] = targetAry[from];
        targetAry[from] = tmp;
    }

    public static void print(final int[] targetAry) {
        final StringBuilder sb = new StringBuilder();
        for (int j = 0; j < targetAry.length; j++) {
            sb.append(targetAry[j]).append(j != targetAry.length - 1 ? ' ' : '\n');
        }
        System.out.print(sb.toString());
    }
}