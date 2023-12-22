import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] b = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
            b[i] = Integer.parseInt(sc.next());
        }
        int[] a = new int[n];
        a[0] = b[0];
        for (int i = 1; i < n - 1; i++) {
            a[i] = Math.min(b[i - 1], b[i]);
        }
        a[n-1] = b[n-2];

        System.out.println(IntStream.of(a).sum());
    }
}
