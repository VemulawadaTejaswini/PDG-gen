import java.io.*;
import java.util.*;


public class Main {

    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
	String[] a=sc.nextLine().split(" ");
	int H=Integer.parseInt(a[0]);
	int N=Integer.parseInt(a[1]);
	String[] line=sc.nextLine().split(" ");
	int[] A=new int[N];
	for(int i=0;i<N;i++){
	A[i]=Integer.parseInt(line[i]);
	}
	Arrays.sort(A);
	int flag=0;
	for(int i=0;i<N;i++){
	H-=A[N-i-1];
	if(H<=0)flag=1;
	}
	if(flag==1)
	System.out.println("Yes");
	else
	System.out.println("No");
		
	
    }

    static class FastScanner {
        private BufferedReader reader = null;
        private StringTokenizer tokenizer = null;

        public FastScanner(InputStream in) {
            reader = new BufferedReader(new InputStreamReader(in));
            tokenizer = null;
        }

        public String next() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public String nextLine() {
            if (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    return reader.readLine();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

            return tokenizer.nextToken("\n");
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public long nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
             return Double.parseDouble(next());
         }



        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        } 
    }
}
