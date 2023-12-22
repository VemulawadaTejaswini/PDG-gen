import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int [] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = cin.nextInt();
        }
        int k = cin.nextInt();
        Arrays.sort(nums);
        nums[2] = nums [2] << k;
        System.out.println(nums[0] + nums[1] + nums[2]);
    }
}
