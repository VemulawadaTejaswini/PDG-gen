package notdivisible;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		FastScanner scanner = new FastScanner(System.in);
        
		int count=0,che;
				long N = scanner.nextInt();
		int a[]=new int[(int) N];
		for(int i=0;i<N;i++)
		{
			a[i]=(int) scanner.nextInt();	
		}
		Arrays.sort(a);

		for(int i=0;i<N;i++)
		{
			che=0;
			for(int j=0;j<N;j++)
			{
				if(a[i] % a[j]==0&&i!=j)
				{
					che=1;
					break;	
				}
				
				
			}
				if(che==0)
				{count++;
				
				}
		}
		System.out.println(count);
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

        public int[] nextIntArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++)
                a[i] = (int) nextInt();
            return a;
        }

        public long[] nextLongArray(int n) {
            long[] a = new long[n];
            for (int i = 0; i < n; i++)
                a[i] = nextLong();
            return a;
        } 
    }
}
