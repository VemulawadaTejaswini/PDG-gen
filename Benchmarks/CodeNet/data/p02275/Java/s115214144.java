import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] asrgs) {
        print(countingSort(read()));
    }

    private static int[] read() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = Integer.parseInt(scanner.next());
        return a;
    }

    private static int[] countingSort(int[] a) {

        int n = a.length;

        int max = a[0];
        for (int i = 1; i < n; i++) max = Math.max(max, a[i]);

        int[] count = new int[max + 1];

        for (int i = 0; i < n; i++)
            count[a[i]]++;

        for (int i = 1; i <= max; i++)
            count[i] += count[i-1];

        int[] result = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            result[count[a[i]]-1] = a[i];
            count[a[i]]--;
        }

        return result;
    }

    private static void print(int[] a) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            sb.append(a[i] + " ");
        }
        System.out.println(sb.toString().trim());
    }
}

