import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
import java.util.InputMismatchException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] s = new int[n];
    	for (int i = 0; i < n; i++) {
    		s[i] = sc.nextInt();
    	}

//    	System.out.println(bubbleSort(s));
    	System.out.println(mergeSort(s, 0, n));

    	sc.close();
	}
	
	public static int bubbleSort(int[] a) {
		  int cnt = 0; // 反転数
		  for (int i = 0; i < a.length; i++) {
			  for (int j = a.length - 1; j > i; j--) {
				  if (a[j] < a[j - 1]) {
					  int temp = a[j];
					  a[j] = a[j - 1];
					  a[j - 1] = temp;
					  cnt++;
				  }
			  }
		  }

		  return cnt;
	}

	public static long mergeSort(int[] a, int left, int right) {
		long cnt = 0; // 反転数
		if (left + 1 < right) {
			int mid = (left + right) / 2;
			cnt += mergeSort(a, left, mid);
			cnt += mergeSort(a, mid, right);
			cnt += merge(a, left, mid, right);
		}

		return cnt;
	}

	public static long merge(int[] a, int left, int mid, int right) {
		long cnt = 0; // 反転数
		int n1 = mid - left;
		int n2 = right - mid;
		int[] l = new int[n1 + 1];
		int[] r = new int[n2 + 1];
		for (int i = 0; i < n1; i++) {
			l[i] = a[left + i];
		}
		for (int i = 0; i < n2; i++) {
			r[i] = a[mid + i];
		}
		l[n1] = Integer.MAX_VALUE;
		r[n2] = Integer.MAX_VALUE;
		
		for (int i = 0, j = 0, k = left; k < right; k++) {
			if (l[i] <= r[j]) {
				a[k] = l[i];
				i++;
			} else {
				a[k] = r[j];
				j++;
				cnt += n1 - i;
			}
		}
		
		return cnt;
	}

	@SuppressWarnings("unused")
	private static class Scanner {
		InputStreamReader isr;
		BufferedReader br;
		StreamTokenizer st;

		private Scanner() {
		}

		Scanner (InputStream in) {
			isr = new InputStreamReader(in);
			br = new BufferedReader(isr);
			st = new StreamTokenizer(br);
		}

		String next() throws RuntimeException  {
			try {
				if (st.nextToken() != StreamTokenizer.TT_WORD) {
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return st.sval;
		}

		int nextInt() throws RuntimeException {
			try {
				if (st.nextToken() != StreamTokenizer.TT_NUMBER) {
					throw new InputMismatchException();
				}
			} catch (IOException e) {
				throw new IllegalStateException();
			}

			return (int)st.nval;
		}

		void close() {
		}
	}
}