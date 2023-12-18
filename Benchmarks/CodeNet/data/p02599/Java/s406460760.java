import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
    private final int LEFT = 0, RIGHT = 1, INDEX = 2;

    /*
    int[] BIT;

    void add(int i, int x){
        if (i == 0) return;

        for (int k = i; k < BIT.length ; k += (k & -k)) {
            BIT[k] += x;
        }
    }

    int sum(int i){
        if(i == 0) return 0;

        int s = 0;
        for (int k=i; k > 0; k -= (k & -k)){
            s += BIT[k];
        }
        return s;
    }
    */

    class Query implements Comparable<Query>{
        int index, left, right;

        public Query(int index, int left, int right) {
            this.index = index;
            this.left  = left;
            this.right = right;
        }

        @Override
        public int compareTo(Query o) {
            return right-o.right;
        }
    }

    public Main() {
        FastScanner scanner = new FastScanner();
        int N = scanner.nextInt();
        int Q = scanner.nextInt();

        int[] C = new int[N+1];
        for (int i = 1; i <= N; i++)
            C[i] = scanner.nextInt();

        int[][] queries = new int[Q][3];
        for (int i = 0; i < Q; i++){
            queries[i][LEFT]  = scanner.nextInt();
            queries[i][RIGHT] = scanner.nextInt();
            queries[i][INDEX] = i;
        }

        //right昇順でソート
        Arrays.sort(queries, Comparator.comparingInt(a -> a[RIGHT]));

        int[] Ans = new int[Q];
        int[] CP  = new int[N+1]; //添え字色の最も右に存在する球の場所

        int index = 1;
        TreeMap<Integer, Integer> TM = new TreeMap<>();
        for (int[] query : queries){
            while(index <= query[RIGHT]){
                if (TM.containsValue(C[index])){
                    TM.remove(CP[C[index]]);
                    TM.put(index, C[index]);
                    CP[C[index]] = index;
                } else {
                    TM.put(index, C[index]);
                    CP[C[index]] = index;
                }
                index++;
            }

            Ans[query[INDEX]] = TM.size()- TM.headMap(query[LEFT]).size();
        }

        /*
        BIT       = new int[N+1];

        HashSet<Integer> R = new HashSet<>(N);
        int queryIndex = 0;
        for (int i = 1; i <= N; i++) {
            R.add(C[i]);
            add(CP[C[i]], -1);
            add(i, 1);
            CP[C[i]] = i;

            while(queries[queryIndex].right == i){
                Ans[queries[queryIndex].index]
                        = R.size() - sum(queries[queryIndex].left-1);
                queryIndex++;
                if (queryIndex == Q) break;
            }
        }
        */

        for (int ans : Ans)
            System.out.println(ans);
    }

    public static void main(String[] args) {
        new Main();
    }
}

class FastScanner {
    private final InputStream in = System.in;
    private final byte[] buffer = new byte[1024];
    private int ptr = 0;
    private int buflen = 0;
    private boolean hasNextByte() {
        if (ptr < buflen) {
            return true;
        }else{
            ptr = 0;
            try {
                buflen = in.read(buffer);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (buflen <= 0) {
                return false;
            }
        }
        return true;
    }
    private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
    private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
    public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
    public String next() {
        if (!hasNext()) throw new NoSuchElementException();
        StringBuilder sb = new StringBuilder();
        int b = readByte();
        while(isPrintableChar(b)) {
            sb.appendCodePoint(b);
            b = readByte();
        }
        return sb.toString();
    }
    public long nextLong() {
        if (!hasNext()) throw new NoSuchElementException();
        long n = 0;
        boolean minus = false;
        int b = readByte();
        if (b == '-') {
            minus = true;
            b = readByte();
        }
        if (b < '0' || '9' < b) {
            throw new NumberFormatException();
        }
        while(true){
            if ('0' <= b && b <= '9') {
                n *= 10;
                n += b - '0';
            }else if(b == -1 || !isPrintableChar(b)){
                return minus ? -n : n;
            }else{
                throw new NumberFormatException();
            }
            b = readByte();
        }
    }
    public int nextInt() {
        long nl = nextLong();
        if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
        return (int) nl;
    }
    public double nextDouble() { return Double.parseDouble(next());}
}
