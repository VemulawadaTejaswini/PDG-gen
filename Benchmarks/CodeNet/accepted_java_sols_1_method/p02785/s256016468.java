import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        Integer[] H = new Integer[N];
        for (int i=0;i<N;i++) {
            H[i] = sc.nextInt();
        }
        Arrays.sort(H, (o1, o2)->Integer.compare(o2, o1));
        long ans = 0L;
        for (int i=0;i<N;i++) {
            if (K>0) {
                K--;
                continue;
            }
            ans += H[i];
        }
        System.out.println(ans);
    }
}