import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

public class Main {
    static int[] set;

    static void union(int v, int u) {
        int vGroup = getGroup(v);
        int uGroup = getGroup(u);
        if(vGroup != uGroup) {
            set[vGroup] = uGroup;// i think its ok, but its better to double check, what if smth goes wrong
        }
    }

    static int getGroup(int v) {
        if(set[v] == v) {
            return v;
        }
        set[v] = getGroup(set[v]);
        return set[v];
    }

    public static void main(String[] args) {
        FastReader fastReader = new FastReader();
        int N = fastReader.nextInt();
        int M = fastReader.nextInt();
        set = new int[N];
        for(int i = 1; i < N; i++) set[i] = i;
        for(int i = 0; i < M; i++) {
            int v1 = fastReader.nextInt() - 1;
            int v2 = fastReader.nextInt() - 1;
            union(v1, v2);
        }
        int[] sizes = new int[N];
        for(int i = 0 ; i < N; i++) {
            sizes[getGroup(i)]++;
        }

        int max = 0;
        for(int i = 0; i < sizes.length; i++) {
            if(sizes[i] > max) {
                max = sizes[i];
            }
        }

        System.out.println(max);
        //what should you do next?
        //calc number of independent groups
    }
    static final Random random=new Random();

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
