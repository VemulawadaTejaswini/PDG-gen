import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int min = Integer.parseInt(sc.next());
        int max = Integer.parseInt(sc.next());
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            char[] array = Integer.toString(i).toCharArray();
            int sum = 0;
            for (char c : array) {
                sum += Character.getNumericValue(c);
            }
            if (sum >= min && sum <= max) {
                ans += i;
            }
        }
        System.out.println(ans);
    }
}
