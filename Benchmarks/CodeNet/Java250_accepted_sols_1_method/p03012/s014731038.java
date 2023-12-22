import java.util.*;

public class Main {

    public static List<List<Integer>> switchList;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int[] s = new int[N + 1];
        s[0] = 0;
        for (int i = 1; i < N + 1; i++) {
            s[i] = a[i - 1] + s[i - 1];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 1; i < N + 1; i++) {
            int S1 = s[i];
            int S2 = s[s.length - 1] - s[i];
            int diff = Math.abs(S1 - S2);
            min = diff <= min ? diff : min;
        }

        System.out.println(min);
    }

}
