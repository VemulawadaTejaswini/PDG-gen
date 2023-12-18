import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

        int q = partition(a, 0, n -1);

        String[] a_s = Arrays.stream(a)
            .mapToObj(String::valueOf)
            .toArray(String[]::new)
            ;
        a_s[q] = "[" + a_s[q] + "]";
        System.out.println(String.join(" ", a_s));

    }

    private static int partition(int[] a, int p, int r) {
        int x = a[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (a[j] <= x) {
                i++;
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
            }
        }
        i++;
        int tmp = a[i];
        a[i] = a[r];
        a[r] = tmp;
        return i;
    }

}

