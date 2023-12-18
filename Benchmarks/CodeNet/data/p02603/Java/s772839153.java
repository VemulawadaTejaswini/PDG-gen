
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long cash = 1000;
        long stocks = 0;

        long[] future = new long[n];
        for (int i = 0; i < n; i++) {
            future[i] = sc.nextLong();
        }

        int currentDay = 1;
        boolean isBuy = true;
        int next;
        while (currentDay <= n && (next = nextDay(future, currentDay, isBuy)) != -1) {
            long price = future[next - 1];

            if (isBuy) {
                long number = cash / price;
                cash -= price * number;
                stocks += number;
            } else {
                cash += price * stocks;
                stocks = 0;
            }

            isBuy = !isBuy;
            currentDay = next + 1;
        }

        System.out.println(cash);
    }

    private static int nextDay(long[] future, int currentDay, boolean isBuy) {
        long current = future[currentDay - 1];
        int nextDay = currentDay;

        for (int i = currentDay; i < future.length; i++) {
            long next = future[i];
            if (isBuy) {
                if (current >= next) {
                    current = next;
                    nextDay = i + 1;
                } else {
                    break;
                }
            } else {
                if (current <= next) {
                    current = next;
                    nextDay = i + 1;
                } else {
                    break;
                }
            }
        }

        if (isBuy && nextDay == future.length) return -1;
        else return nextDay;
    }
}
