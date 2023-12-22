import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int ans = 0;
        for (int i = 1; i < n + 1; i++) {
            if (String.valueOf(i).length() % 2 == 1) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}