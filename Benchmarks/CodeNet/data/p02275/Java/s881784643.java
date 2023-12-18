import java.io.*;
public class Main {
    public static void main (String[] args) throws IOException{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	long start = System.currentTimeMillis();
	int n = Integer.parseInt(br.readLine());
	int[] a = new int[n];
	String[] inputArray = br.readLine().split(" ");
	int k = 0;
	for (int i = 0; i < n; i++) {
	    a[i] = Integer.parseInt(inputArray[i]);
	    if (a[i] > k) {
		k = a[i];
	    }
	}
	int[] b = new int[n];
	CountingSort(a, b, k+1);
	StringBuilder sb = new StringBuilder();
	for (int i = 0; i < n - 1; i++) {
	    sb.append(b[i] + " ");
	}
	sb.append(b[n-1]);
	System.out.println(sb);
    }
    static void CountingSort (int[] a, int[] b, int k) {
	int n = a.length;
	int[] c = new int[k];
	for (int i = 0; i < k; i++) {
	    c[i] = 0;
	}
	for (int i = 0; i < n; i++) {
	    c[a[i]]++;
	}
	for (int i = 1; i <k; i++) {
	    c[i] = c[i] + c[i-1];
	}
	for (int i = n - 1; i >= 0; i--) {
	    b[c[a[i]]-1] = a[i];
	    c[a[i]]--;
	}
    }
}