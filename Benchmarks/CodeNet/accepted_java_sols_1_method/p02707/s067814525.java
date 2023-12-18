import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.next());
        int[] a = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            a[i] = Integer.parseInt(scanner.next());
        }
        int[] count = new int[n];
        for (int i = 0; i < n; i++) {
            count[i] = 0;
        }
        for (int ai: a) {
            count[ai-1] ++;
        }
        for (int ci: count) {
            System.out.println(ci);
        }
    }
}
