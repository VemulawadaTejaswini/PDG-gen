import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for(int i = 0; i < 3; i++) {
            nums[i] = sc.nextInt();
        }
        int count = 0;
        while(nums[0] != nums[1] || nums[1] != nums[2]) {
            Arrays.sort(nums);
            if(nums[2] - nums[0] >= 2) {
                nums[0] += 2;
            } else {
                nums[0]++;
                nums[1]++;
            }
            count++;
        }
        System.out.println(count);
    }
}