import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();

        int ans = x - t;
        if (ans < 0) ans = 0;

        System.out.println(ans);
    }
}
