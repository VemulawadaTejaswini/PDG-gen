
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner std = new Scanner(System.in);
        int n = std.nextInt();
        int k = std.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            int h = std.nextInt();
            if (h - k >= 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}
