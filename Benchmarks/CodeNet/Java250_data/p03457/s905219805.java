import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String ans = "Yes";

        int nowT = 0;
        int nowX = 0;
        int nowY = 0;

        for (int i = 0; i < n; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int vGap = Math.abs(x - nowX) + Math.abs(y - nowY);
            int tGap = t - nowT;
            if (vGap > t - nowT) {
                ans = "No";
                break;
            } else if (vGap % 2 != tGap % 2) {
                ans = "No";
                break;
            }
        }

        System.out.println(ans);
    }
}