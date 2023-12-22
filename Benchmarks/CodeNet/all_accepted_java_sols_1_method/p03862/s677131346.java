import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        long count = 0;
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            int sum = array[i] + array[i + 1];
            if (sum > x) {
                int gap = sum - x;
                if (gap > array[i + 1]) {
                    array[i] -= gap - array[i + 1];
                    array[i + 1] = 0;
                } else {
                    array[i + 1] -= gap;
                }
                count += gap;
            }
        }

        System.out.println(count);
    }
}