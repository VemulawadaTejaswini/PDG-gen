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
        int K = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++)A[i]=sc.nextInt();
        SegmentTree st = new SegmentTree(N);
        
        //for(int i=0;i<N;i++)st.update(i, A[i]);
        //int prev = st.getIn(0, K);
        for(int i=K;i<N;i++){
            //int now = st.getIn(i-K, i);
            //System.out.println(now);
            int prev = A[i-K];
            int now = A[i];
            //System.out.println(prev);
            //System.out.println(now);
            System.out.println(prev<now?"Yes":"No");
        }

    }

    public static void main(String[] args) {
        new Main();
    }
}
