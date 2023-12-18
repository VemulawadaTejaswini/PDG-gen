import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int h = std.nextInt();
        int n = std.nextInt();
        int[] as = new int[n];
        for (int i = 0; i < n; i++) {
            as[i] = std.nextInt();
        }

        String ans = "No";
        if (h <= Arrays.stream(as).sum()) {
            ans = "Yes";
        }

        System.out.println(ans);
    }
}
