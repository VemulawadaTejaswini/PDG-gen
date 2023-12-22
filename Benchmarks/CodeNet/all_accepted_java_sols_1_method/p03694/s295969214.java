import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt());
        Arrays.sort(a);
        System.out.println(a[n - 1] - a[0]);
    }
}