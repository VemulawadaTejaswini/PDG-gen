import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();
        int[] Vi = new int[N];
        for (int i = 0; i < Vi.length; i++) {
            Vi[i] = stdIn.nextInt();
        }
        int[] Ci = new int[N];
        for (int i = 0; i < Ci.length; i++) {
            Ci[i] = stdIn.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            if (Vi[i] - Ci[i] > 0) {
                sum += Vi[i] - Ci[i];
            }
        }
        System.out.println(sum);
    }
}