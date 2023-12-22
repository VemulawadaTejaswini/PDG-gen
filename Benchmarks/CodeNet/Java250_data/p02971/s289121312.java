import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        solve();
    }

    private static void solve() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] nums = new int[n];

        int first = 0;
        int second = 0;

        for (int i = 0; i < n; i++) {
        	nums[i]  = input.nextInt();
        	if (nums[i] >= first) {
        		second = first;
        		first = nums[i];
        	} else if (nums[i] >= second) {
        		second = nums[i];
        	}
        }

        for (int i = 0; i < n; i++) {
        	if (nums[i] == first) {
                System.out.println(second);
        	} else {
                System.out.println(first);
        	}
        }
    }
}
