import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String[] nums = new String[Integer.parseInt(num)];
        for(int i=0;i<Integer.parseInt(num); i++) {
            nums[i] = sc.nextLine();
        }
        check(num, nums);
    }

    public static void check(String num, String[] nums) {

        int[] vals = new int[nums.length];
        for(int i=0; i<vals.length; i++) {
            vals[i] = Integer.parseInt(nums[i]);
        }
        int max =0;
        int maxi = 0;
        for (int i=0;i<vals.length; i++){
            if(max < vals[i]) {
                max = vals[i];
                maxi = i;
            }
        }
        int max2 = 0;
        for (int i=0;i<vals.length; i++) {
            if(i == maxi) {
                continue;
            }
            if (max2 < vals[i] && max > max2) {
                max2 = vals[i];
            }
        }
        for(int i=0;i<Integer.parseInt(num);i++) {
            if(vals[i] == max) {
                System.out.println(max2);
            } else {
                System.out.println(max);
            }
        }
    }
}