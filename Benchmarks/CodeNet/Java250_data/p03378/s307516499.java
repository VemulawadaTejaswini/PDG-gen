import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[] nums = new int[m];

        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        sc.close();

        int num = 0;

        for (int i = 0; i < m; i++) {
            if (nums[i] >= x) {
                num++;
            }
        }
        int ans = Math.min(m - num, num);
        System.out.println(ans);
    }
}