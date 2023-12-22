import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        boolean flag = true;
        for (int i = 0; i < n; i++) {
            if (nums[i] % 2 == 0) {
                if (!(nums[i] % 3 == 0 || nums[i] % 5 == 0)) {
                    flag = false;
                    break;
                }
            }
        }
        System.out.println(flag ? "APPROVED" : "DENIED");
    }
}