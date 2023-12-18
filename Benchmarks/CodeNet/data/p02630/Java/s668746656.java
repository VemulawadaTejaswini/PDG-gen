import java.util.*;

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int N = Integer.parseInt(sc.next());
            int[] a = new int[N];
            int[] num = new int[100001];
            long sum = 0;

            for (int i = 0; i < N; i++) {
                int input = Integer.parseInt(sc.next());
                a[i] = input;

                num[a[i]]++;
                sum += input;
            }

            int Q = Integer.parseInt(sc.next());
            for (int i = 0; i < Q; i++) {
                int b = Integer.parseInt(sc.next());
                int c = Integer.parseInt(sc.next());


                int cnt = num[b];
                if (cnt > 0) {
                    num[c] += cnt;
                    num[b] = 0;
                }
                sum += (c - b) * cnt;
                System.out.println(sum);
            }
        }
    }
}