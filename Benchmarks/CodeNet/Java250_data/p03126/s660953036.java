import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());
        int[] K = new int[N];
        int[] f = new int[M];
        for(int i=0; i<N; i++) {
            K[i] = Integer.parseInt(sc.next());
            int a = 0;
            for(int j=0; j<K[i]; j++) {
                a = Integer.parseInt(sc.next());
                f[a-1]++;
            }
        }
        int count = 0;
        for(int x : f) {
            if(x == N) {
                count++;
            }
        }
        System.out.println(count);
    }
}