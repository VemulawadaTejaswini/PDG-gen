import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int N;
    static int[] b;

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        b = new int[N - 1];
        for(int i = 0; i < N - 1; i++) {
            b[i] = scanner.nextInt();
        }
        scanner.close();
    }


    public static void main(String args[]) {
        init();

        ArrayList<Integer> l = new ArrayList<>();
        l.add(b[0]);
        l.add(b[N - 2]);

        int min = Integer.MAX_VALUE;
        for(int i = 1; i < N - 1; i++) {
            min = Math.min(b[i], b[i - 1]);
            l.add(min);
        }

        int ans = 0;
        for(int i: l) {
            ans += i;
        }
        System.out.println(ans);
    }
}
