import java.util.*;
import java.io.*;

public class Main {
	class Total {
		int id, total;
		public Total(int id, int total){
			this.id = id;
			this.total = total;
		}
		public void add(int x){
			total += x;
		}
	}
	class PriorityQueue {
		Total[] heap;
		int size;
		int[] idx;
		public PriorityQueue(int n){
			heap = new Total[n];
			size = n;
			idx = new int[n];
			for(int i = 0; i < n; i++){
				heap[i] = new Total(i+1, 0);
				idx[i] = i;
			}
		}
		public void addValue(int a, int x){
			heap[idx[a]].total += x;
			if( x > 0 ){
				heapify_up(idx[a]);
			} else {
				heapify_down(idx[a]);
			}
		}
		public void swap(int x, int y){
			Total temp = new Total(heap[x].id, heap[x].total);
			heap[x] = heap[y];
			heap[y] = temp;
			idx[heap[x].id-1] = x;
			idx[heap[y].id-1] = y;
 		}
		public int compare(Total x, Total y){
			if( x.total > y.total ){
				return -1;
			}
			if( x.total == y.total && x.id < y.id ){
				return -1;
			}
			return 1;
		}
		public void heapify_up(int a){
			int par = (a-1)/2;
			if( compare(heap[a], heap[par]) < 0 ){
				swap(a, par);
				heapify_up(par);
			}
		}
		public void heapify_down(int a){
			int ch1 = 2*a+1;
			int ch2 = 2*a+2;
			int max = a;
			if( ch1 < size && compare(heap[ch1], heap[max]) < 0 ){
				max = ch1;
			}
			if( ch2 < size && compare(heap[ch2], heap[max]) < 0 ){
				max = ch2;
			}
			if( max != a ){	
				swap(a, max);
				heapify_down(max);
			}
		}
	}
	public void solve() throws IOException {
		int n = nextInt();
		PriorityQueue queue = new PriorityQueue(n);
		int q = nextInt();
		for(int i = 0; i < q; i++){
			int a = nextInt();
			int v = nextInt();
			queue.addValue(a-1, v);	
			writer.println(queue.heap[0].id + " " + queue.heap[0].total);
		}			
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}

	BufferedReader reader;
	StringTokenizer tokenizer;
	PrintWriter writer;

	public void run() throws IOException {
		try {
			reader = new BufferedReader(new InputStreamReader(System.in));
			tokenizer = null;
			writer = new PrintWriter(System.out);
			solve();
			reader.close();
			writer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String nextToken() throws IOException {
		while (tokenizer == null || !tokenizer.hasMoreTokens()) {
			tokenizer = new StringTokenizer(reader.readLine());
		}
		return tokenizer.nextToken();
	}

	public int nextInt() throws IOException {
		return Integer.parseInt(nextToken());
	}
}