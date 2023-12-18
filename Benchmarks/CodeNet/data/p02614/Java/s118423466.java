 import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
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
            int H = in.nextInt();
            int W = in.nextInt();
            int K = in.nextInt();  // desired black cells remaining in board i.e. # 
            char[][] matrix = new char[H][W];
            
            for(int i = 0; i < H; i++){
            	String row_val = in.next();
            	int col = 0;
            	for(char ch : row_val.toCharArray()){
            		matrix[i][col++] = ch;
            	}
            }
            
            List<List<Integer>> resultH = new ArrayList<>();
            List<Integer> running = new ArrayList<>();
            combinations(resultH, running, H, 0);
            
            List<List<Integer>> resultW = new ArrayList<>();
            running = new ArrayList<>();
            combinations(resultW, running, W, 0);
            
            int K_black_cells = 0;
            for(int i = 0; i < resultH.size(); i++){
            	for(int j = 0; j < resultW.size(); j++){
            		List<Integer> curr_rows = resultH.get(i);
            		List<Integer> curr_cols = resultW.get(j);
            		
            		int black_cells = 0;
            		
            		for(int m = 0; m < H; m++){
            			for(int n = 0; n < W; n++){
            				if(!curr_rows.contains(m) && !curr_cols.contains(n)){
            					if(matrix[m][n] == '#')
            						black_cells++;
            				}
            			}
            		}
            		
            		if(black_cells == K)
            			K_black_cells ++;
            	}
            }
            
            out.println(K_black_cells);
            
        }
        
        
        
       public void combinations(List<List<Integer>> result, List<Integer> running, int n, int start){
      	
         result.add(new ArrayList<>(running));
         
         for(int i = start ; i < n; i++){
       	  	running.add(i);
       	  	combinations(result, running, n, i+1);
       	  	running.remove(running.size() - 1); // backtracking
         }
        	  
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