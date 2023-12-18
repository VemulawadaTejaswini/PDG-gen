import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        int[] arr = new int[count];
        for (int i = 0; i < count; ++i) {
            arr[i] = scanner.nextInt();
        }

        int beforePrev = 0;
        int prev = Math.abs(arr[1] - arr[0]);
        for (int i = 2; i < count; ++i) {
            int cur = Math.min(
                    Math.abs(arr[i] - arr[i - 1]) + prev,
                    Math.abs(arr[i] - arr[i - 2]) + beforePrev);
            beforePrev = prev;
            prev = cur;
        }
        System.out.println(prev);
    }
}
