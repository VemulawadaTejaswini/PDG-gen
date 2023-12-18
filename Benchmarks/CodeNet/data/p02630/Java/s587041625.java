
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() { return Long.parseLong(next());  }
    }

    public static void main(String[] args) {
        FastReader sn = new FastReader();
        int N = sn.nextInt();
        int []arr = new int[N];
        for(int i=0;i<N;i++) {
            arr[i] = sn.nextInt();
        }
        int Q = sn.nextInt();
        while (Q-- > 0) {
            int real = sn.nextInt();
            int replace = sn.nextInt();
            for(int i=0;i<N;i++) {
                if(arr[i] == real) {
                    arr[i] = replace;
//                    break;
                }
            }
//            System.out.println(Arrays.toString(arr));
            int sum=0;
            for (int i : arr) {
                sum+=i;
            }
            System.out.println(sum);
        }
    }
}
