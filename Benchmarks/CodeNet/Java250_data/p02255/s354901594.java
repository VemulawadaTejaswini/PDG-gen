
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class Main {
	
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
	    BufferedReader in = new BufferedReader(reader);
		
		String s = in.readLine();
		int n = Integer.parseInt(s);
		s = in.readLine();
		String[] as = s.split(" ");
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(as[i]);
		}
		output(a);
		insertionSort(a,n);
	}

	private static void insertionSort(int[] a, int n) {
		// TODO Auto-generated method stub
		for(int i = 1; i < n; i++) {
			int v = a[i];
			int j = i - 1;
			while(j >= 0 && a[j] > v) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = v;
			output(a);
		}
	}

	private static void output(int[] a) {
		// TODO Auto-generated method stub
		for(int i = 0; i < a.length-1; i++) {
			System.out.print(a[i] + " ");
			
		}
		
		System.out.println(a[a.length-1]);
	}
	
	
}
