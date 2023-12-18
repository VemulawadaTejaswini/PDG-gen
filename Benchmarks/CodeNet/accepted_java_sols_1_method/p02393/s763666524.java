import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] nums = new int [3];

        Scanner in = new Scanner(System.in);
        for(int x = 0; x < nums.length; x++){
            nums[x] = in.nextInt();
        }
        Arrays.sort(nums);
        System.out.println(nums[0] + " "+ nums[1] + " " + nums[2]);
    }
}