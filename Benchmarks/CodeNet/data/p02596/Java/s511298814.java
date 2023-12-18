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
        public void solve(int testNumber, InputReader in, PrintWriter out) {
            
        	int K = in.nextInt();
          

            int prev = 7;
            int steps = 0, rem = 0;
            while (steps < 1e7) {
                ++steps;
                rem += prev;
                if (rem % K == 0 || rem == 0) break;
                prev = (prev * 10) % K;
                rem %= K;
            }
        	
        	System.out.println((steps < 1e7) ? steps : -1); 
        	/*
        	int N = in.nextInt();
        	int Q = in.nextInt();
        	int[] balls = new int[N];
        	for(int i = 0 ; i < N ; i ++){
        		balls[i] = in.nextInt();
        	}
        	//how many unique balls at any point to left 
        	Set<Integer> set = new HashSet<>();
        	int[] dp = new int[N];
        	
        	for(int i = 1; i <= N ; i++){
        		set.add(balls[i-1]);
        		dp[i-1] = set.size();
        	}
        	
        	for(int i = 0; i < Q; i++){
        		
        		int left = in.nextInt()-1; //index
        		int right = in.nextInt()-1;
        		
        		System.out.println(dp[right] - dp[left]+1);
        	}*/
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