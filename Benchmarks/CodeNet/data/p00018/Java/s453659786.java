import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] nums = new int[5];

        for(int i = 0; i < 5; i++){
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);

        for(int i = 4; i >= 0; i--){
            System.out.print(nums[i]);
            System.out.print(" ");
        }

    }
}