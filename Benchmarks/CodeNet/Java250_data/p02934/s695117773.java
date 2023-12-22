import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = in.nextInt();
        }

        double sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Math.pow(nums[i], -1);
        }

        System.out.println(Math.pow(sum, -1));
    }
}