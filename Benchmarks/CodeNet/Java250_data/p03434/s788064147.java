import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        Integer[] nums = new Integer[N];

        for (int i = 0; i < N ; i++) {
            nums[i] = scanner.nextInt();
        }

        int diff = 0;
        boolean isEven = (N % 2) == 0;

        Arrays.sort(nums, Collections.reverseOrder());

        int pairLastIndex = isEven ? N-1: N-2;
        for (int i = 0; i < pairLastIndex ; i = i+2) {
            diff += nums[i] - nums[i+1];
        }

        if (!isEven) diff += nums[N-1];

        System.out.println(diff);

    }
}