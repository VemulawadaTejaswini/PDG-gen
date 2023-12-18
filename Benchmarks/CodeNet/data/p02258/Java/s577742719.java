import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        maximumProfit();
    }

    private static void maximumProfit() {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int min = in.nextInt();
        int next = in.nextInt();
        int maxDiff = next - min;
        if (next < min) { min = next; }
        for (int i = 0; i < length - 2; i++) {
            int value = in.nextInt();
            if (value - min > maxDiff) {
                maxDiff = value - min;
            }
            if (value < min) {
                min = value;
            }
        }
        System.out.println(maxDiff);
    }
}
