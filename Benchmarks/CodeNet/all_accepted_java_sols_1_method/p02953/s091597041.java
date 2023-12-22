import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[] h = new int[n];

        String[] nums = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            h[i] = Integer.parseInt(nums[i]);
        }

        for (int i = 0; i < n; i++) {
            if (i >= 1  && h[i - 1] > h[i]) {
                System.out.print("No");
                return;
            }

            if (i == 0) {
                if (h[i] - 1 >= 1) {
                    h[i] -= 1;
                }
            } else if (h[i - 1] < h[i]) {
                h[i] -= 1;
            }
        }
        System.out.print("Yes");
    }
}