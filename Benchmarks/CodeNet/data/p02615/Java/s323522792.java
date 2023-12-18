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
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(Comparator.comparing(Pair::getSum).reversed());
        Arrays.sort(A);
        queue.add(new Pair(A[N-1], A[N-2]));
        queue.add(new Pair(A[N-1], A[N-2]));
        ans += A[N-1];
        for(int i=N-3;i>=0;--i){
            Pair top = queue.poll();
            ans += Math.min(top.p,top.q);
            queue.add(new Pair(top.p,A[i]));
            queue.add(new Pair(top.q,A[i]));
            // System.out.println(ans);
        }
        System.out.println(ans);
    }

    class Pair{
        int p,q;
        int sum;
        Pair(int a,int b){
            p=a;q=b;
            sum=a+b;
        }
        public int getSum() {
            return sum;
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}
