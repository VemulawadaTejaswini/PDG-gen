import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] array = new int[n];
		
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		long cost = 0;
		for(int i = 0; i < n - 1; i++){
			int min = array[i];
			int min_pos = i;
			
			for(int j = i + 1; j < n; j++){
				if(array[j] < min){
					min = array[j];
					min_pos = j;
				}
			}
			
			if(min_pos != i){
				cost += array[i] + min;
				
				array[min_pos] = array[i];
				array[i] = min;
			}
		}
		
		System.out.println(cost);
	}
	
	public static class Scanner {
	    private BufferedReader br;
	    private StringTokenizer tok;

	    public Scanner(InputStream is) throws IOException {
	        br = new BufferedReader(new InputStreamReader(is));
	    }

	    private void getLine() throws IOException {
	        while (!hasNext()) { tok = new StringTokenizer(br.readLine()); }
	    }

	    private boolean hasNext() {
	        return tok != null && tok.hasMoreTokens();
	    }

	    public String next() throws IOException {
	        getLine(); return tok.nextToken();
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