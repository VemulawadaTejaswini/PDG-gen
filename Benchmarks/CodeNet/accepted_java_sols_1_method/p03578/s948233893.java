import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] d = new int[n];
        Arrays.setAll(d, i -> scanner.nextInt());
        Arrays.sort(d);
        int m = scanner.nextInt();
        int[] t = new int[m];
        Arrays.setAll(t, i -> scanner.nextInt());
        Arrays.sort(t);
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (d[i] == t[j]) {
                i++;
                j++;
            } else if (d[i] < t[j]) {
                i++;
            } else {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}