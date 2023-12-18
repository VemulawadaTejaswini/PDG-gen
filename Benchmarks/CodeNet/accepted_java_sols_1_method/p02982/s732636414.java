import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    private static List<Integer> p = IntStream.rangeClosed(1, 126).mapToObj(i -> i * i).collect(Collectors.toList());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[][] x = new int[n][d];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < d; j++) {
                x[i][j] = sc.nextInt();
            }
        }
        int c = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int s = 0;
                for (int k = 0; k < d; k++) {
                    s += (x[i][k] - x[j][k]) * (x[i][k] - x[j][k]);
                }
                if (p.contains(s)) {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}
