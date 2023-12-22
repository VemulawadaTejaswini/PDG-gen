import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }
        int number = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            if (number > h[i])
                ans += number - h[i];
            number = h[i];
        }
        ans += number;
        System.out.println(ans);
    }
}
