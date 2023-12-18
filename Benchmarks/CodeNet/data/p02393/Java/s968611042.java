import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++){
            Scanner in = new Scanner(System.in);
            nums[i] = in.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
    }
}