import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());
        int x[] = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int sum = Arrays.stream(x).max().getAsInt() - Arrays.stream(x).min().getAsInt();
        if (n >= m) {
            System.out.println(0);
            return;
        } else if (n == 1) {
            System.out.println(sum);
            return;
        }
        Arrays.sort(x);
        Integer y[] = new Integer[m - 1];
        for (int i = 0; i < m - 1; i++) {
            y[i] = x[i + 1] - x[i];
        }
        Arrays.sort(y, Comparator.reverseOrder());
        for (int i = 0; i < n - 1; i++) {
            sum -= y[i];
        }
        System.out.println(sum);
    }
}