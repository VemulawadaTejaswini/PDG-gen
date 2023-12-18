import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static final int SIZE = 3;
	public static final int ALL_SIZE = SIZE * SIZE;
	
	public static int[] factor=  {
		1, 1, 2, 6, 24, 120, 720, 5040, 50320, 362880
	}; //0, 1, 2, 3, 4, 5, 6, 7, 8, 9
	
	//完全最小ハッシュを作る.
	public static int hash(int[] A){
		int[] A_ = new int[A.length];
		System.arraycopy(A, 0, A_, 0, A.length);
		
		int ret = 0;
		
		for(int i = 0; i < A_.length; i++){
			ret += A_[i] * factor[(A.length - i - 1)];
			
			for(int j = i + 1; j < A_.length; j++){
				if(A_[j] >= A_[i]){ A_[j]--; }
			}
		}
		
		return ret;
	}
	
	public static int[] unhash(int hash){
		int[] ret = new int[ALL_SIZE];
		
		for(int i = 0; i < ALL_SIZE; i++){
			ret[i] = hash / factor[ALL_SIZE - i - 1];
			hash -= factor[ALL_SIZE - i - 1] * ret[i];
		}
		
		for(int i = ALL_SIZE - 1; i >= 0; i--){
			for(int j = i + 1; j < ALL_SIZE; j++){
				if(ret[i] <= ret[j]) ret[j]++;
			}
		}
		
		return ret;
	}

	public static final int GOAL = hash(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0});
	public static final int MAX = hash(new int[]{8, 7, 6, 5, 4, 3, 2, 1, 0}) + 1;
	
	public static final int[] moves = new int[]{1, -1, SIZE, -SIZE};
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println(Arrays.toString(unhash(GOAL)));
		
		int[] visited = new int[MAX];
		Arrays.fill(visited, Integer.MAX_VALUE);
		LinkedList<Integer> queue = new LinkedList<Integer>();
		
		int[] input = new int[ALL_SIZE];
		for(int i = 0; i < SIZE; i++){
			for(int j = 0; j < SIZE; j++){
				input[i * SIZE + j] = sc.nextInt();
			}
		}
		
		final int hash_input = hash(input);
		queue.add(hash_input);
		visited[hash_input] = 0;
		while(!queue.isEmpty()){
			final int hashed = queue.poll();
			
			if(hashed == GOAL){
				System.out.println(visited[hashed]);
				break;
			}
			
			final int dist = visited[hashed];
			
			int[] ret = unhash(hashed);
			
			for(int i = 0; i < ALL_SIZE; i++){
				if(ret[i] == 0){
					for(int move : moves){
						if(i + move >= 0 && i + move < ALL_SIZE){
							int tmp = ret[i];
							ret[i] = ret[i + move];
							ret[i + move] = tmp;
							
							final int next_hash = hash(ret);
							if(visited[next_hash] > dist + 1){
								visited[next_hash] = dist + 1;
								queue.add(next_hash);
							}
							
							tmp = ret[i];
							ret[i] = ret[i + move];
							ret[i + move] = tmp;
						}
					}	
				}
			}
		}
		
	}

	public static class Scanner {
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