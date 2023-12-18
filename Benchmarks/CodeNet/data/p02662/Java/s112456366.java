import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int N;
    static int S;
    static int[] A;
    static long[] t = new long[30];

    public static void main(String[] args) throws NumberFormatException, IOException {
        init30();
        read();
    }

    public static void init30(){
        t[0] =1;
        for(int i = 1;i<=29;i++){
            t[i] = 1<<i;
        }
    }


    static class ListSet {
        List<Integer> list = new ArrayList<>();

        public ListSet() {
        }

        public void addSet(int set) {
            list.add(set);
        }

        public void union(ListSet listset) {
            if (listset == null) {
                return;
            }
            for (int set : listset.list) {
                this.list.add(set);
            }
        }

        public static ListSet unionSet(ListSet L, ListSet Q) {
            if (L == null && Q == null) {
                return null;
            }
            ListSet res = new ListSet();
            res.union(L);
            res.union(Q);
            return res;
        }

        public ListSet clone() {
            ListSet listset = new ListSet();
            for (int set : this.list) {
                listset.list.add(set);
            }
            return listset;
        }

        public static ListSet unionEle(ListSet L, int elment) {
            ListSet res = new ListSet();
            for (int set : L.list) {
                res.addSet(set+1);
            }
            if (res.list.isEmpty()) {
                res.list.add(1);
            }
            return res;
        }

        @Override
        public String toString() {
            return "ListSet [list=" + list + "]";
        }

    }

    private static void read() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split(" ");
        N = Integer.parseInt(word[0]);
        S = Integer.parseInt(word[1]);
        word = br.readLine().split(" ");
        A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = Integer.valueOf(word[i]);
        }
        ListSet[][] F = new ListSet[N][S + 1];

        for (int s = 0; s <= S; s++) {
            F[0][s] = null;
        }
        F[0][0] = new ListSet();
        ListSet listset = new ListSet();
        listset.addSet(1);

        if (A[0] <= S)
            F[0][A[0]] = listset;

        for (int i = 1; i < N; i++) {
            F[i][0] = new ListSet();
            for (int j = A[i]; j <= S; j++) {
                if ( F[i-1][j-A[i]] != null) {
                    ListSet Q = ListSet.unionEle(F[i-1][j - A[i]], i);
                    F[i][j] = ListSet.unionSet(F[i-1][j], Q);
                }
            }
        }
        List<Integer > tmp = F[N-1][S].list;
        if( tmp == null){
            System.out.println(0);
            br.close();
            return;
        }
        long res = 0;
        for (int size : tmp) {
            int leftsize = N - size;
            res = (res + mypower(2, leftsize)) % 998244353;
        }
        System.out.println(res);
        br.close();
    }

    public static long mypower(int base, int power) {
        int i = 0;
        long res = 1;
        while (i < power) {
            i = i + 29;

            if (i > power) {
                res = res*t[power-(i-29)]%998244353;
            } else {
                res = (res *t[29]) % 998244353;
            }

        }

        return res;
    }
}
