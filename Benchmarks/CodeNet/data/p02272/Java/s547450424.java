
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {

	static int count = 0;
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		int n = Integer.parseInt(in.readLine());

		String[] tmp = in.readLine().split(" ");
		int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(tmp[i]);
		}
		mergeSort(a, 0, n-1);

	}
	static void mergeSort(int[] a, int left, int right) {
		if(left >= right) return;
		int mid = (left + right) / 2;
		mergeSort(a, left, mid);
		mergeSort(a, mid+1, right);
		merge(a, left, mid, right);
	}
	static void merge(int[] a, int left, int mid, int right) {
		int n1 = mid-left;
		int n2 = right-mid;
		
		int[] b = new int[n1+1];
		for(int i = 0; i <n1; i++) {
			b[i] = a[left + i];
		}		
		b[n1] = Integer.MAX_VALUE;
		int[] c = new int[n2+1];
		for(int i = 0; i <n2; i++) {
			c[i] = a[mid+1 + i];
		}
		c[n2] = Integer.MAX_VALUE;
		
		int i = 0, j = 0;
		for (int k = left; k < right+1; k++) {
			if(b[i] >= c[j]) {
				a[k] = c[j];
				j++;
			} else {
				a[k] = b[i];
				i++;
			}
			count++;
		}
	}
	
}
