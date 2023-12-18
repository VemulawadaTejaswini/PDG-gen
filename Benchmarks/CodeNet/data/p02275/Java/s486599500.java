import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {		
		int n = nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		
		for (int i = 0; i < n; i ++) {
			A[i] = nextInt();
		}
		
		countingSort(A, B, 10000);
		
		PrintWriter out = new PrintWriter(System.out);
		for (int i = 0; i < n - 1; i ++) {
			out.print(B[i] + " ");
		}
		out.println(B[n - 1]);
		out.flush();
		out.close();
	}
	
	public static void countingSort(int[] A, int[] B, int k) {
		int[] C = new int[k + 1];
		
		for (int i = 0; i < A.length; i++) {
			C[A[i]]++;
		}
		
		for (int i = 1; i <= k; i++) {
			C[i] += C[i - 1];
		}
		
		for (int i = A.length - 1; i >= 0; i--) {
			B[C[A[i]] - 1] = A[i];
			C[A[i]]--;
		}
	}

	private static byte[] buf = new byte[1 << 20];
	private static int len = 0;
	private static int ptr = 0;

	private static byte read() {
		if (ptr >= len) {
			try {
				len = System.in.read(buf);
			} catch (Exception e) {
			}
			ptr = 0;
		}

		return buf[ptr++];
	}

	private static int nextInt() {
		int num = 0;

		byte b = read();
		while(!Character.isDigit(b)) b = read();
		while(Character.isDigit(b)) {
			num *= 10;
			num += b - '0';
			b = read();
		}

		return num;
	}
} 

