
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
    	static int counter = 0;
        public void solve(int testNumber, InputReader in, PrintWriter out) {

        	int N = in.nextInt(); // total people
        	int M = in.nextInt(); // relationships
 
        	Map<Integer, Set<Integer>> graph = new HashMap<>();
        	for(int i = 0; i < M ; i++){
        		int key = in.nextInt();
        		int friend = in.nextInt();
        		Set<Integer> set1 = graph.getOrDefault(key, new HashSet<Integer>());
        		Set<Integer> set2 = graph.getOrDefault(friend, new HashSet<Integer>());
        		set1.add(friend);
        		set2.add(key);
        		graph.put(key, set1);
        		graph.put(friend, set2);
        	}
        	
        	int ans = 1;
        	Set<Integer> visited = new HashSet<>();
        	for(Integer key :graph.keySet()){
    			dfs(graph, key, visited);
    			ans = Math.max(ans, counter);
    			counter = 0; //resetting the counter back for next group
        	}
        	out.print(ans);
        }
        
        public void dfs(Map<Integer, Set<Integer>> graph, int key, Set<Integer> visited){
        	if(!graph.containsKey(key))
        		return;
        	counter ++;
        	visited.add(key);
        	for(int friend : graph.get(key)){
        		if(!visited.contains(friend))
        			dfs(graph, friend, visited);
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

