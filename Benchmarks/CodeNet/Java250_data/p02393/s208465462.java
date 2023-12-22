import java.util.*;

class SortingThreeNumbers {
    public static void main(String...args) {
        final Scanner sc = new Scanner(System.in);
        final int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}
public class Main {
    public static void main(String... args) {
        SortingThreeNumbers.main();
    }
}