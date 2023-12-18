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
	
	public static int MergeSort(final int[] A, final int[] tmp, final int left, final int right){ //[left, right)		
		if(left + 1 < right){
			final int mid = (left + right) / 2;
			
			int ret = 0;
			ret += MergeSort(A, tmp, left, mid);
			ret += MergeSort(A, tmp, mid, right);
			
			final int l_size = mid - left;
			final int r_size = right - mid;
			final int size = l_size + r_size;
			int count = 0;
			int l_pos = left;
			int r_pos = mid;
			while(count < size){
				if(l_pos == left + l_size){
					tmp[left + count] = A[r_pos];
					r_pos++;
					count++;
					ret++;
				}else if(r_pos == mid + r_size){
					tmp[left + count] = A[l_pos];
					l_pos++;
					count++;
					ret++;
				}else if(A[l_pos] <= A[r_pos]){
					tmp[left + count] = A[l_pos];
					l_pos++;
					count++;
					ret++;
				}else{
					tmp[left + count] = A[r_pos];
					r_pos++;
					count++;
					ret++;
				}
			}
			
			for(int pos = left; pos < right; pos++){
				A[pos] = tmp[pos];
			}
			/*
			System.out.print("[" + left + "," + right + ") -> ");
			for(int i = left; i < right; i++){
				System.out.print(" " + A[i]);
			}
			System.out.println();
			*/
			return ret;
		}
		
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] array = new int[n];
		int[] tmp = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		final int ret = MergeSort(array, tmp, 0, array.length);
		
		for(int i = 0; i < n; i++){
			if(i != 0){
				System.out.print(" ");
			}
			System.out.print(array[i]);
		}
		System.out.println();
		System.out.println(ret);
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