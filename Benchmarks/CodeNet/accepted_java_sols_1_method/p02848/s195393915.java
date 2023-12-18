import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		char A[] = new char[S.length()];
		for(int i = 0; i <= S.length()-1; i++) {
			A[i] = S.charAt(i);
		}
		int B[] = new int[S.length()];
		for(int i = 0; i <= S.length()-1; i++) {
			B[i] = (int)A[i];
			B[i] += N;
			if(B[i] > 90) {
				B[i] -= 26;
			}
		}
		for(int i = 0; i < S.length(); i++) {
			A[i] = (char)B[i];
		}
		for(int i = 0; i < S.length(); i++) {
			System.out.print(A[i]);
		}
		sc.close();
	}

}
