import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] heights = new int[N + 1];
        for (int i = 0; i < N; i++) heights[i] = in.nextInt();
        heights[N] = Integer.MAX_VALUE;

        int res = 0, i = 0, j = 1;
        while(j < N + 1) {
            if (heights[j] <= heights[j - 1]) {
                j++;
            } else {
                res = Math.max(res, j - i - 1);
                i = j;
                j++;
            }
        }
        System.out.println(res);
    }
}
