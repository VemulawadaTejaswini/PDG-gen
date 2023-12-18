import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[N];
        for(int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
        }
        long answer = 0;
        for(int i = 0; i < N; i++) {
            long surplus = a[i] - x;
            if (surplus > 0) {
                a[i] -= surplus;
                answer += surplus;
            }
            if (i > 0) {
                long pairSurplus = a[i] + a[i-1] - x;
                if (pairSurplus > 0) {
                    a[i] -= pairSurplus;
                    answer += pairSurplus;
                }
            }
        }
        System.out.println(answer);
    }
}