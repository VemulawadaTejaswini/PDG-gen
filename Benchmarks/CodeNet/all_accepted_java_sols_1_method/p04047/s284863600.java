import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next()) * 2;
        int[] stick = new int[n];
        for (int i = 0; i < n; i++) {
            stick[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(stick);
        int sum = 0;
        for (int i = 0; i < n; i += 2) {
            int tmp = Math.min(stick[i], stick[i + 1]);
            sum += tmp;
        }
        System.out.println(sum);
    }
}