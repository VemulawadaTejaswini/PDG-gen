import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int minR = 0;
        int maxDiff = -1000000000;
        for (int i = 0; i < n; i++) {
            int r = scanner.nextInt();
            if (i == 0) {
                minR = r;
                continue;
            }
            int diff = r - minR;
            if (maxDiff < diff) {
                maxDiff = diff;
            }
            if (r < minR) {
                minR = r;
            }
        }
        System.out.println(maxDiff);
    }
}