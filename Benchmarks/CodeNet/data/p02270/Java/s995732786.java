import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int items = sc.nextInt();
        int trucks = sc.nextInt();
        int[] weights = new int[items];
        for (int i = 0; i < items; i++) {
            int t = sc.nextInt();
            weights[i] = t;
        }
        System.out.println(binarySearch(weights, trucks));
    }

    private static int binarySearch(int[] weights, int trucks) {
        int left = 0;
        int right = Integer.MAX_VALUE;
        int mid = -1, count;
        while (left < right - 1) {
            mid = (left + right) / 2;
            count = itemCount(weights, trucks, mid);
            if (count >= weights.length) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return mid;
    }

    private static int itemCount(int[] weights, int trucks, int maxWeight) {
        int count = 0;
        for (int i = 0; i < trucks; i++) {
            int tmp = 0;
            while (weights[count] + tmp <= maxWeight) {
                tmp += weights[count];
                count++;
                if (count == weights.length) {
                    return count;
                }
            }
        }
        return count;
    }
}