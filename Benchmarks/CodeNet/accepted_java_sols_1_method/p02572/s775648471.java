import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {
    static final int MOD = 1000000007;
    static final int INF = 1 << 30;
    static final int ALF = 26;

    Main() {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] A = new int[N];
        long[] B = new long[N+1];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        B[0]=A[0];
        for(int i=1;i<N;i++){
            B[i]=(B[i-1]+A[i])%MOD;
        }
        for(int i=0;i<N;i++){
            long tmp = A[i]*( (B[N-1]-B[i])<0?(B[N-1]-B[i])+MOD:(B[N-1]-B[i]) );
            tmp%=MOD;
            ans+=tmp;
            ans%=MOD;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}
