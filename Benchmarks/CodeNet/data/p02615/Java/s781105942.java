import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            int N = Integer.parseInt(sc.next());
            Integer[] a = new Integer[N];
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(sc.next());
            }
            Arrays.sort(a, Collections.reverseOrder());

            // Calc
            long ans = 0; int cnt = 0, index = 1;
            for (int i = 0; i < N; i++) {
                switch(i) {
                    case 0:
                        break;
                    case 1:
                        ans += a[0];
                        break;
                    default:
                        if (cnt == 2) {
                            cnt = 0;
                            index++;
                        }
                        cnt++;
                        ans += a[index];
                        System.out.println(i + " | " + a[index]);
                }
            }
            System.out.println(ans);
        }
    }
}
