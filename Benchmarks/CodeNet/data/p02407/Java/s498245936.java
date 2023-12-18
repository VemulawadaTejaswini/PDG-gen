import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int length = scanner.nextInt();
        int[] nums = new int[length];
        
        for (int i=0; i<length; i++) {

            int num = scanner.nextInt();
            nums[length-i-1] = num;
            
            
        }
        
        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]);
            if (i!=nums.length-1) System.out.print(" ");
        }
        System.out.println();
        
    }
}
