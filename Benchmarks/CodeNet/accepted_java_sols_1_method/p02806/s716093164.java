import java.util.*;
import java.util.Collections;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] s = new String[N];
        int[] t = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = sc.next();
            t[i] = sc.nextInt();
        }
        String X = sc.next();


        int time = 0;
        boolean start = false;
        for (int i = 0; i < N; i++) {
            if (start) {
                time += t[i];
            }

            if (X.equals(s[i])) {
                start = true;
            }
        }

        System.out.println(time);

    }
}
