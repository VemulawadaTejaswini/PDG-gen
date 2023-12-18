import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if ((long)X*X+(long)Y*Y <= (long)D*D) ans++;
        }

        System.out.println(ans);
    }
}
