import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = Integer.parseInt(scanner.nextLine());
        long[] sums = new long[N];
        String[] array = scanner.nextLine().split(" ");
        long sum = 0;
        for (int i = 0; i < N; ++i) {
            sum += Long.parseLong(array[i]);
            sums[i] = sum;
        }
        Arrays.sort(sums);
        long count = 0;
        long prep = sums[0];
        long subCount = 0;
        for (int i = 1; i < N; ++i) {
            if (sums[i] == prep) {
                ++subCount;
            } else {
                if (prep == 0) {
                    subCount += 1;
                }
                if (subCount > 0) {
                    count += (subCount * (subCount + 1)) / 2;
                    subCount = 0;
                }
                prep = sums[i];
            }
        }
        if (prep == 0) {
            subCount += 1;
        }
        if (subCount > 0) {
            count += (subCount * (subCount + 1)) / 2;
        }
        System.out.println(count);
    }
}