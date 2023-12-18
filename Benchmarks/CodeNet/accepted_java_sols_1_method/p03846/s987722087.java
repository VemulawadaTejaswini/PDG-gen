import java.util.*;

public class Main {
    static int MOD = 1000000007;
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        
        Arrays.sort(nums);
        
        boolean clear = true;
        int answer = 0;
        if (n % 2 == 0) {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (nums[i] - 1 != i) {
                        clear = false;
                        break;
                    }
                } else {
                    if (nums[i] != i) {
                        clear = false;
                        break;
                    }
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    if (nums[i] != i) {
                        clear = false;
                        break;
                    }
                } else {
                    if (nums[i] - 1 != i) {
                        clear = false;
                        break;
                    }
                }
            }
        }
        
        if (clear) {
            answer = 1;
            
            // answer = Math.pow(2, n / 2) % MOD;
            for (int i = 1; i <= n / 2; i++) {
                answer = answer * 2 % MOD;
            }
        }
        
        System.out.println(answer);
    }
    
    
}
