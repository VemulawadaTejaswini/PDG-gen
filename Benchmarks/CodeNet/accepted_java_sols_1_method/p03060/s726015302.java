import java.util.*;
        import java.lang.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] V = new int[N];
        int[] C = new int[N];

        int ans=0;

        for(int n=0; n<N; n++) V[n] = sc.nextInt();
        for(int n=0; n<N; n++) C[n] = sc.nextInt();
        for(int n=0; n<N; n++) ans += Math.max(0, V[n]-C[n]);

        System.out.println(ans);

    }
}