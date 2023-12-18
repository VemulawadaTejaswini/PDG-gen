import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        int n = Integer.parseInt(line1);
        String[] lines = new String[n];
        for(int i = 0; i < n; i++) {
            lines[i] = sc.nextLine();
        }
        int[] nums = new int[3];
        for(int i = 0; i < n; i++) {
            String[] line = lines[i].split(" ");
            nums[0] = Integer.parseInt(line[0]);
            nums[1] = Integer.parseInt(line[1]);
            nums[2] = Integer.parseInt(line[2]);
            Arrays.sort(nums);
            if(Math.pow(nums[0], 2) + Math.pow(nums[1], 2) == Math.pow(nums[2], 2)) {
                System.out.println("YES");                
            }else {
                System.out.println("NO");
            }
        }
        
    }
 } 
