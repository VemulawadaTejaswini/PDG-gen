import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeSet;
 
public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		final int m = sc.nextInt();
		
		ArrayList<Integer> one_pos = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			final int val = sc.nextInt();
			
			if(val == 1){
				one_pos.add(i);
			}
		}
		
		int[] runs = new int[m];
		for(int i = 0; i < m; i++){
			runs[i] = sc.nextInt();
		}
		
		int answer = Integer.MAX_VALUE;
		for(int i = 0; i < 2; i++){
			boolean bit = (i == 1);
			
			ArrayList<Integer> answer_one_pos = new ArrayList<Integer>();
			int sum = 0;
			for(int j = 0; j < m; j++){
				if(bit){
					for(int k = 0; k < runs[j]; k++){
						answer_one_pos.add(sum + k);
					}
				}
								
				sum += runs[j];
				bit = !bit;
			}
			//System.out.println(one_pos + " " + answer_one_pos);
			if(one_pos.size() != answer_one_pos.size()){
				continue;
			}
			
			int score = 0;
			for(int j = 0; j < one_pos.size(); j++){
				score += Math.abs(one_pos.get(j) - answer_one_pos.get(j));
			}
			
			answer = Math.min(answer, score);
		}
		
		System.out.println(answer);
	}
 
	public static class Scanner implements Closeable {
		private BufferedReader br;
		private StringTokenizer tok;
 
		public Scanner(InputStream is) throws IOException {
			br = new BufferedReader(new InputStreamReader(is));
		}
 
		private void getLine() throws IOException {
			while (!hasNext()) {
				tok = new StringTokenizer(br.readLine());
			}
		}
 
		private boolean hasNext() {
			return tok != null && tok.hasMoreTokens();
		}
 
		public String next() throws IOException {
			getLine();
			return tok.nextToken();
		}
 
		public int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
 
		public long nextLong() throws IOException {
			return Long.parseLong(next());
		}
 
		public void close() throws IOException {
			br.close();
		}
	}
 
}