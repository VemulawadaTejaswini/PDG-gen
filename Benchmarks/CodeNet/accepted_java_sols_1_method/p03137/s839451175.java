import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] x = new int[m];
        for (int i = 0; i < m; i++) {
            x[i] = in.nextInt();
        }
        ArrayList<Integer> diffs = new ArrayList<>();
        Arrays.sort(x);
        for (int i = 1; i < m; i++) {
            diffs.add(Math.abs(x[i] - x[i - 1]));
        }
        Collections.sort(diffs);
        int sum = 0;
        for (int i = 0; i < diffs.size() - (n - 1); i++) {
            sum += diffs.get(i);
        }

        System.out.println(sum);
    }
}
