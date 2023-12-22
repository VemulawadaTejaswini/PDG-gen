import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] X = new long[N];
        long[] L = new long[N];
        ArrayList<long[]> arms = new ArrayList<long[]>();
        for (int i=0;i<N;i++) {
            X[i] = sc.nextInt();
            L[i] = sc.nextInt();
            long[] add = {X[i]-L[i], X[i]+L[i]};
            arms.add(add);
        }
        Collections.sort(arms, (o1, o2)->Long.compare(o1[1], o2[1]));
        long used = -3_000_000_000L;
        int cnt = 0;
        for (int i=0;i<N;i++) {
            long before = arms.get(i)[0];
            long after = arms.get(i)[1];
            if (used<=before) {
                used = after;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}