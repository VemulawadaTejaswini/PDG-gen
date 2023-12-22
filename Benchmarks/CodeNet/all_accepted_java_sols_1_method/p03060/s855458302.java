import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] Vi = new int[N];
        int[] Ci = new int[N];

        for (int i= 0; i<N; i++) {
            Vi[i] = sc.nextInt();
        }
        for (int i= 0; i<N; i++) {
            Ci[i] = sc.nextInt();
        }
        int X = 0;
        int Y = 0;
        for (int i= 0; i<N; i++) {
            if (Vi[i] <= Ci[i]) continue;

            X += Vi[i];
            Y += Ci[i];
        }


        System.out.println(X - Y);
    }
}