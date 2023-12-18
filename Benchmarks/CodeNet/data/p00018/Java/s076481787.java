import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        
        String[] linesp = line.split(" ");
        
        int[] nums = new int[5];
        for(int i = 0; i < 5; i++) {
            nums[i] = Integer.parseInt(linesp[i]);
        }
        Arrays.sort(nums);
        for(int i = 4; i >= 0; i--) {
            System.out.print(nums[i]);
            if(i > 0) {
                System.out.print(" ");
            }else {
                System.out.println("");
            }
            
        }
    }
}
