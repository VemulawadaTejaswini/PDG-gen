import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        ArrayList<Integer> work = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
            work.add(nums[i]);
        }

        sc.close();
        Collections.sort(work);

        for (int i = 0; i < n; i++) {
            if (nums[i] <= work.get((n - 1) / 2)) {
                System.out.println(work.get((n + 1) / 2));
            } else {
                System.out.println(work.get((n - 1) / 2));
            }
        }
    }
}