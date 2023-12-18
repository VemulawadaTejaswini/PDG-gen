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
	
	public static int swap(int[] array, int a, int b){
		int tmp = array[a];
		array[a] = array[b];
		array[b] = tmp;
		
		return array[a] + array[b];
	}
	
	public static int do_swap(int[] array, int[] sorted, int min_pos, boolean act){
		final int min = array[min_pos];
		int loop = min_pos;
		int sum = 0;
		
		do{
			for(int i = 0; i < array.length; i++){
				if(array[i] == sorted[loop]){
					if(act){
						sum += swap(array, i, loop);
					}else{
						sum += array[i] + min;
					}
					loop = i;
					break;
				}
			}
			
		}while(min != sorted[loop]);
		
		return sum;
	}
	
	public static int swapping(int[] array, int[] sorted){
		final int absolute_min = sorted[0];
		int absolute_min_pos = -1;
		int min = Integer.MAX_VALUE, min_pos = -1;
		
		for(int i = 0; i < array.length; i++){
			if(array[i] == absolute_min){
				absolute_min_pos = i;
				break;
			}
		}
		
		for(int i = 0; i < array.length; i++){
			if(sorted[i] != array[i] && min > array[i]){
				min = array[i];
				min_pos = i;
			}
		}
		
		if(min_pos == -1){
			return 0;
		}
		
		final int direct = do_swap(array, sorted, min_pos, false);
		
		swap(array, min_pos, absolute_min_pos);
		final int indirect = do_swap(array, sorted, min_pos, false) + min + absolute_min;
		swap(array, min_pos, absolute_min_pos);

		if(direct <= indirect){
			return do_swap(array, sorted, min_pos, true);
		}else{
			swap(array, min_pos, absolute_min_pos);
			return do_swap(array, sorted, min_pos, true);
		}
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		int[] array  = new int[n];
		int[] sorted = new int[n];
		for(int i = 0; i < n; i++){
			array[i]  = sc.nextInt();
			sorted[i] = array[i];
		}
		Arrays.sort(sorted);
		
		int answer = 0, ret = 0;
		while((ret = swapping(array, sorted)) != 0){
			answer += ret;
		}
		
		System.out.println(answer);
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