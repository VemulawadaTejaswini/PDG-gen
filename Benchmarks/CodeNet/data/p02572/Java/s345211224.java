import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;


public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskT solver = new TaskT();
        solver.solve(1, in, out);
        out.close();
    }
    
    

    static class TaskT {
    	static int cnt = Integer.MAX_VALUE;
        public void solve(int testNumber, InputReader in, PrintWriter out) {
        	
        	// take reverse sum from end 
        	int N = in.nextInt();
        	int[] input = new int[N];
        	for(int i = 0; i < N; i ++)
        		input[i] = in.nextInt();
        	
        	int runningSum = 0;
        	double[] reverseSum = new double[N];
        	for(int i = N-1; i >=0 ; i--){
        		runningSum += input[i];
        		reverseSum[i] = (runningSum) % (1e9 + 7);
        	}
        	
        	double ans = 0;
        	for(int i = 0; i < N-1; i++)
        		ans += (input[i] * reverseSum[i+1]) ;

        	
        	ans = ans % (1e9 + 7);
        	out.print((int)ans);

        }
        
        

    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
        
        public long nextLong() {
            return Long.parseLong(next());
        }
    }
}
