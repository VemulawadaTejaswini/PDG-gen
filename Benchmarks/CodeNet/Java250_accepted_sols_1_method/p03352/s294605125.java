import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int ans = 0;

        for (int i = 1; i < 1000; i++) {
            for (int j = 2; j < 1000; j++) {
                if (Math.pow(i, j) > X) {
                    break;
                } else {
                    if (ans < Math.pow(i, j)) {
                        ans = (int)Math.pow(i, j);
                    }
                }
            }
        }
        System.out.println(ans);
    }
}