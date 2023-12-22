import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        long[] sum = new long[n];
        sum[0] += array[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + (long) array[i];
        }
        int startIndex = 0;
        int index = 0;
        while (true) {
            int upperBound = -(Arrays.binarySearch(array, 2 * sum[index] + 0.1)) - 2;
            if (upperBound >= index) {
                if (sum[upperBound] * 2 >= array[n -  1]) {
                    System.out.println(n - startIndex);
                    return;
                }
                if (upperBound > index) {
                    index = upperBound;
                    continue;
                }
            }
            startIndex = index + 1;
            index++;
        }
    }
}