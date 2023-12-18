import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static class Size {
		int[] A;
		int[] B;
		Size(int n) {
			A = new int[n];
			B = new int[n + 1];
		}
	}
	
	public static void main(String[] args) {
		String li = new String();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		try {
			 li = li = bufferedReader.readLine(); 
		} catch (IOException e) {
			System.out.println("e");
		}
		int siz = Integer.parseInt(li);
		Size size = new Size(siz);
		try {
			li = bufferedReader.readLine();
			StringTokenizer stringTokenizer = new StringTokenizer(li);
			for (int i = 0; i < siz; i++) {
				size.A[i] = Integer.parseInt(stringTokenizer.nextToken());
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		countingSort(size.A, size.B, 10001);
		StringBuffer stringBuffer = new StringBuffer(80000);
		for (int i = 1; i <= siz; i++) {
			stringBuffer.append(size.B[i]);
			if (i != siz) stringBuffer.append(" ");
		}
		System.out.println(stringBuffer);
	}

	static void countingSort(int[] A, int[] B, int k) {
		int C[] = new int[k];
		int aLength = A.length;
		int bLength = B.length;
		for (int i = 0; i < aLength; i++) {
			C[A[i]]++;
		}
		for (int i = 1; i < k; i++) {
			C[i] += C[i - 1];
		}
		for (int i = aLength - 1; i >= 0; i--) {
			int p = A[i];
			B[C[p]] = p;
			C[p]--;
		}
//		for (int i = 1; i < bLength; i++) {
//			if (i == bLength - 1) {
//				System.out.println(B[i]);
//			} else {
//				System.out.print(B[i] + " ");
//			}
//		}
	}

}