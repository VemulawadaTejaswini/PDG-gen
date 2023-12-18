import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            int nextInt = in.nextInt();
            if (nextInt > k) k = nextInt;
            a[i] = nextInt;
        }
        int[] b = new int[n];
        System.out.println(countingSort(a, b, k));
    }

    private static String countingSort(int[] a, int[] b, int k) {
        int[] c = new int[k+1];
        // Count each value
        for (int value : a) {
            c[value]++;
        }
        // Number of values <= to i
        for (int i = 1; i <= k; i++) {
            c[i] += c[i-1];
        }
        for (int j = a.length - 1; j >= 0; j--) {
            b[c[a[j]]-1] = a[j];
            c[a[j]]--;
        }

        return printArray(b);
    }

    static String printArray(int[] a) {
        StringBuilder sb = new StringBuilder();
        sb.append(a[0]);
        for (int i = 1; i < a.length; i++) {
            sb.append(" ").append(a[i]);
        }
        return sb.toString();
    }
}

