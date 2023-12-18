import java.io.*;
import java.util.*;

class Main{
	static int[] A, B;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		A = new int[n];
		str = br.readLine().split(" ");
		for(int i = 0; i < n; i++) A[i] = Integer.parseInt(str[i]);
		str = br.readLine().split(" ");
		int q = Integer.parseInt(str[0]);
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int b = Integer.parseInt(str[0]);
			int m = Integer.parseInt(str[1]);
			int e = Integer.parseInt(str[2]);
			B = A.clone();
			for(int j = 0; j < e - b; j++){
				B[b + ((j + (e - m)) % (e - b))] = A[b + j];
			}
			A = B.clone();
		}
		for(int i = 0; i < n; i++){
			System.out.print(A[i]);
			if(i != n - 1) System.out.print(" ");
		}
		System.out.print("\n");
	}
}

