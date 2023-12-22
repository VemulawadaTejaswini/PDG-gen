import java.util.*;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int x = sc.nextInt();
        int ans = 1;
        int d = 0;

        for (int i = 2; i <= n + 1; i++) {
            int l = sc.nextInt();
            int value = d + l;
            if (value > x) {
                break;
            } else {
                ans++;
            }
            d = value;
        }
        System.out.println(ans);
    }
}