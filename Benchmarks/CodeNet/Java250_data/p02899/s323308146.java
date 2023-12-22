import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashMap;
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
            int num_students = in.nextInt();
            
            Map<Integer, Integer> map = new HashMap<>();
            int[] arr = new int[num_students];
            for(int i = 0; i < num_students; i++){
            	int num_present = in.nextInt();
            	// no.1-> 2 present ; no.2 ->  3 present; no.3 -> 1 present
            	arr[i] = num_present;  // when ith student enters then already num_present no. of students in the class 
            	map.put(num_present, i+1) ; // since i is student number start from 1 	
            }
            Arrays.sort(arr);
            for(int i = 0; i < arr.length; i++)
            	System.out.print(map.get(arr[i]) + " ");
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

    }
}