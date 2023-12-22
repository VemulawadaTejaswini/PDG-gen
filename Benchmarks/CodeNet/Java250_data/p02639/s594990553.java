import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i=0; i<nums.length; i++){
            nums[i] = sc.nextInt();
            if(nums[i]==0){
                System.out.print(i+1);
                return;
            }
        }
    }
}