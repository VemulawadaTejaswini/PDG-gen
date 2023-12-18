import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int n = scanner.nextInt();
        int[] a = new int[n];
        Arrays.setAll(a, i -> scanner.nextInt() - 1);
        boolean[] visited = new boolean[n];
        int i = 0, j = 0;
        while (true) {
            j++;
            visited[i] = true;
            if (visited[a[i]]) {
                System.out.println(-1);
                return;
            }
            i = a[i];
            if (i == 1) {
                System.out.println(j);
                return;
            }
        }
    }
}