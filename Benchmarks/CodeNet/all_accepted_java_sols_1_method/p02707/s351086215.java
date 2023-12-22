//デバッグ用

import java.io.*;
import java.util.Scanner;//スキャナつかう

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      	Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();

		int A[] = new int[N];

		for (int i = 0; i < N; i++) {
			A[i] = 0;
        }
      
		for (int i = 0; i < N - 1; i++) {
			int count = scan.nextInt();
			A[count - 1]++;
		}

		for (int i = 0; i < N; i++) {
			System.out.println(A[i]);
		}
	}
}
