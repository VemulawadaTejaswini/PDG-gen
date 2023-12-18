import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] linesp = line.split(" ");
        int x = Integer.parseInt(linesp[0]);
        int y = Integer.parseInt(linesp[1]);
        int[] nums = new int[2];
    
        if(x > y) {
            nums[0] = x;
            nums[1] = x % y;
            while(nums[0] > 0 && nums[1] > 0) {
                int a = nums[1];
                nums[1] = nums[0] % nums[1];
                nums[0] = a;
            }
        } else {
            nums[0] = y;
            nums[1] = y % x;
            while(nums[0] > 0 && nums[1] > 0) {
                int a = nums[1];
                nums[1] = nums[0] % nums[1];
                nums[0] = a;
            }
        }
        
        if(nums[0] == 0) {
            System.out.println(nums[1]);
        }else {
            System.out.println(nums[0]);
        }
        
    }
 }
 
