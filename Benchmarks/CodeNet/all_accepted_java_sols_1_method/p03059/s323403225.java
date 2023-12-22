import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int T = (int) Math.round(sc.nextInt() + 0.5);

        int b = 0;
        for (int t = 1; t < T; t++) {
            if (t % A == 0) {
                b += B;
            }
        }

        System.out.println(b);
    }
}