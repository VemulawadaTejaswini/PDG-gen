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
	
	public static class Card implements Comparable<Card> {
		char suite;
		int value;
		
		public Card(char suite, int value) {
			super();
			this.suite = suite;
			this.value = value;
		}

		@Override
		public int compareTo(Card arg0) {
			return this.value - arg0.value;
		}
		
		@Override
		public String toString(){
			return this.suite + " " + this.value;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + suite;
			result = prime * result + value;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Card other = (Card) obj;
			if (suite != other.suite)
				return false;
			if (value != other.value)
				return false;
			return true;
		}
	}
	
	public static int partition(Card[] A, int p, int r){
		final int x = A[r].value;
		
		int i = p - 1;
		for(int j = p; j < r; j++){
			if(A[j].value <= x){
				i++;
				
				Card tmp = A[i];
				A[i] = A[j];
				A[j] = tmp;
			}
		}
		
		Card tmp = A[i + 1];
		A[i + 1] = A[r];
		A[r] = tmp;
		
		return i + 1;
	}
	
	public static void quickSort(Card[] A, int p, int r){
		if(p < r){
			final int q = partition(A, p, r);
			quickSort(A, p, q - 1);
			quickSort(A, q + 1, r);
		}
	}
	
	public static void mergeSort(final Card[] A, final int left, final int right){ //[left, right)        
        if(left + 1 < right){
            final int mid = (left + right) / 2;
             
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
             
            final int l_size = mid - left;
            final int r_size = right - mid;
            final int size = l_size + r_size;
            Card[] ls = new Card[l_size];
            for(int i = 0; i < l_size; i++){
                ls[i] = A[left + i];
            }
            Card[] rs = new Card[r_size];
            for(int i = 0; i < r_size; i++){
                rs[i] = A[mid + i];
            }
             
            int l_pos = 0, r_pos = 0;
            int count = 0;
            while(count < size){
                if(l_pos == l_size){
                	A[left+count] = rs[r_pos];
                	r_pos++;
                }else if(r_pos == r_size){
                	A[left+count] = ls[l_pos];
                	l_pos++;
                }else if(ls[l_pos].compareTo(rs[r_pos]) <= 0){
                    A[left + count] = ls[l_pos];
                    l_pos++;
                }else{
                    A[left + count] = rs[r_pos];
                    r_pos++;
                }
                count++;
            }
        }
    }
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		final int n = sc.nextInt();
		Card[] array = new Card[n];
		Card[] stable = new Card[n];
		for(int i = 0; i < n; i++){
			final char suite = sc.next().charAt(0);
			final int value = sc.nextInt();
			
			array[i] = new Card(suite, value);
			stable[i] = new Card(suite, value);
		}
		
		quickSort(array, 0, n - 1);
		mergeSort(stable, 0, n);
		
		boolean same = true;
		for(int i = 0; i < n; i++){
			if(!array[i].equals(stable[i])){
				same = false;
				break;
			}
		}
		
		System.out.println(same ? "Stable" : "Not stable");
		for(int i = 0; i < n; i++){
			System.out.println(array[i]);
		}
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