import java.util.Arrays;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {

            int n = scanner.nextInt();
            int[] nums = new int[n];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = scanner.nextInt();
            }
            int res = 0;
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    if (nums[j] == nums[i]) {
                        continue;
                    }
                    for (int k = j + 1; k < nums.length; k++) {
                        if (nums[k] == nums[j]) {
                            continue;
                        }
                        if (nums[i] + nums[j] > nums[k]) {
                            res++;
                        }
                    }
                }
            }
            System.out.println(res);
        }
    }

}
