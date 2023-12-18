package Introduction.ITP1;
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
        for (int x : nums){
            System.out.print(x + " ");
        }
        System.out.println();
    }
}