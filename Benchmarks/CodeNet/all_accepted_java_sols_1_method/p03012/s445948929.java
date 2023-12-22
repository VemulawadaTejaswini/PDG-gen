import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int[] ws = new int[n];
        for (int i = 0; i < n; i++) {
            ws[i] = std.nextInt();
        }

        int left = 0;
        int right = 0;
        int rightIndex = n - 1;
        for (int i = 0; i < n; i++) {
            for (int j = rightIndex; j >= 0; j--) {
                if (rightIndex < i) {
                    break;
                }
                int rightValue = ws[j];
                if (right <= left) {
                    right += rightValue;
                    rightIndex--;
                } else {
                    break;
                }
            }

            if (rightIndex < i) {
                break;
            }
            int leftValue = ws[i];
            if (left <= right) {
                left += leftValue;
            }
        }

        System.out.println(Math.abs(left - right));
    }
}
