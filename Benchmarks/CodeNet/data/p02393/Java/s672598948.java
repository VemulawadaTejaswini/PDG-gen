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
        String buf = "";
        for (int num: nums){
                buf += num + " ";
         
        }
        System.out.println(buf.trim());
    }
}