import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] prob = new int[N];
        prob[0] = 1;
        int[] cnt = new int[N];
        Arrays.fill(cnt, 1);
        for (int i=0;i<M;i++) {
            int x = Integer.parseInt(sc.next())-1;
            int y = Integer.parseInt(sc.next())-1;
            cnt[x]--;
            cnt[y]++;
            if (prob[x]==1) {
                prob[y]=1;
            }
            if (cnt[x]==0) prob[x]=0;
        }
        int ans = 0;
        for (int i=0;i<N;i++) {
            if (prob[i]==1) ans++;
        }
        System.out.println(ans);
    }
}