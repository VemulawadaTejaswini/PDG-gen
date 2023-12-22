import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int[] a = new int[N];
        for(int i = 0; i<N; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        Arrays.sort(a);
        int ans = 0;
        for(int i = 0; i<K; i++) {
            ans += a[a.length - 1 - i];
        }
        System.out.println(ans);
    }
}