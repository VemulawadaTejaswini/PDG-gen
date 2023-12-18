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
	
	public static long MergeSort(final int[] A, final int left, final int right){ //[left, right)        
		if(left + 1 < right){
            final int mid = (left + right) / 2;
             
            long ret = 0;
            ret += MergeSort(A, left, mid);
            ret += MergeSort(A, mid, right);
             
            final int l_size = mid - left;
            final int r_size = right - mid;
            final int size = l_size + r_size;
            int[] ls = new int[l_size];
            for(int i = 0; i < l_size; i++){
                ls[i] = A[left + i];
            }
            int[] rs = new int[r_size];
            for(int i = 0; i < r_size; i++){
                rs[i] = A[mid + i];
            }
             
            int l_pos = 0, r_pos = 0;
            int count = 0;
            while(count < size){
            	if(l_pos == l_size){
            		A[left + count] = rs[r_pos];
            		r_pos++;
            	}else if(r_pos == r_size){
            		A[left + count] = ls[l_pos];
            		l_pos++;
            	}else if(ls[l_pos] <= rs[r_pos]){
                    A[left + count] = ls[l_pos];
                    l_pos++;
                }else{
                    A[left + count] = rs[r_pos];
                    ret += ((mid + r_pos) - (left + count));
                    r_pos++;
                }
                
                count++;
            }
             
            return ret;
        }
         
        return 0;
    }
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = sc.nextInt();
		}
		
		System.out.println(MergeSort(array, 0, array.length));
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