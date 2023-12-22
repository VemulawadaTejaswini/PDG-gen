import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] d = new int[n];
        Arrays.setAll(d, i -> scanner.nextInt());
        Arrays.sort(d);
        System.out.println(d[n / 2] - d[n / 2 - 1]);
    }
}