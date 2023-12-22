import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double ans = 1;
        for (int i = 1; i < x; i++) {
            for (int j = 2; j < x; j++) {
                if (Math.pow(i, j) > x)
                    break;
                else
                    ans = Math.max(ans, (Math.pow(i, j)));
            }
        }
        System.out.println((int) ans);
    }
}