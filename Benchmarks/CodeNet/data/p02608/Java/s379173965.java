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
            
        	int N = in.nextInt();
        	for(int i = 1; i <=N; i++){
        		if(i < 6)
        			out.println(0);
        		else
        			out.println(possible(i));
        	}
        	
        }
        
        public int possible(int N){
        	//for a given number find all possible number that combine
        	int count = 0; 
        	
        	for(int i= 1; i < N; i++){
        		for(int j = 1; j < N; j++){
        			for(int k = 1; k < N; k++){
        				 int sum = i*i + j*j + k*k + i*j + j*k + i*k;
        				 if(sum == N)
        					 count ++;
        			}
        		}
        	}
        	
        	return count;
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