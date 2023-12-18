import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        String line = sc.nextLine();
        int n = Integer.parseInt(line);
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) {
            String line1 = sc.nextLine();
            nums[i] = Integer.parseInt(line1);
        }
    
        for(int i = 0; i < n; i++) {
            boolean sosuu = true;
            if(nums[i] <= 1) {
                sosuu = false;
            }
            for(int j = 2; j <= Math.sqrt(nums[i]); j++) {
                if(nums[i] % j == 0) {
                    sosuu = false;
                }
            }
            if(nums[i] == 2) {
                sosuu = true;
            }
            if(sosuu) {
                ans++;
            }
        }
        System.out.println(ans);
        
        
    }
 }
 
