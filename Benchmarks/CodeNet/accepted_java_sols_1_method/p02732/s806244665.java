import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] cnt = new int[N];
        for (int i=0;i<N;i++) {
            A[i] = sc.nextInt();
            cnt[A[i]-1]++;
        }
        long tmp = 0L;
        for (int i=0;i<N;i++) {
            tmp += (long)cnt[i]*(cnt[i]-1)/2;
        }
        for (int i=0;i<N;i++) {
            long minus = (long)cnt[A[i]-1]*(cnt[A[i]-1]-1)/2;
            tmp -= minus;
            cnt[A[i]-1]--;
            tmp += (long)cnt[A[i]-1]*(cnt[A[i]-1]-1)/2;
            System.out.println(tmp);
            tmp += minus-(long)cnt[A[i]-1]*(cnt[A[i]-1]-1)/2;
            cnt[A[i]-1]++;
        }
    }
}