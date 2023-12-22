import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int G = sc.nextInt();
        int B = sc.nextInt();
        int N = sc.nextInt();
        //Rr + Gg + Bb = N
        int ans = 0;
        for(int b = 0; b < N + 1; b++) {
            int M = N - B * b;
            if (M < 0) break;
            for (int g = 0; g < N + 1; g++) {
                int L = M - G * g;
                if (L < 0) break;
                if (L%R == 0) ans++;
            }
        }
        System.out.println(ans);
    }
}