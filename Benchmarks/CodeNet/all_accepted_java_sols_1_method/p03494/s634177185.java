import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.next());
        int[] nums = new int[a];
        for (int i = 0; i < a; i++) {
            nums[i] = Integer.parseInt(sc.next());
        }
        int cnt = 0;
        while (true) {
            boolean existOdd = false;
            for (int i = 0; i < a; i++) {
                if (nums[i] % 2 != 0) existOdd = true;
            }
            
            if (existOdd) break;
            
            for (int i = 0; i < a; i++) {
                nums[i] = nums[i] / 2;
            }
            cnt++;
        }
        
        System.out.println(cnt);
        
    }
}
