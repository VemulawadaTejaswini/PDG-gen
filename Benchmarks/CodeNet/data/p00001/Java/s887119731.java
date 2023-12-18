import java.util.Arrays;
import java.util.Scanner;

class Main {
    private static void solve(int n) {
        Scanner scanner = new Scanner(System.in);
        int[] heights = new int[n];
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        Arrays.sort(heights);
        for (int i = 0; i < 3; i++) {
            System.out.println(heights[heights.length - i - 1]);
        }
    }

    public static void main(String... args) {
        solve(10);
    }
}