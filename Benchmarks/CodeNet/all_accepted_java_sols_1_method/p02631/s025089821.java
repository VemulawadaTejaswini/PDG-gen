import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i = 0 ; i < N ; ++i){
			A[i] = sc.nextInt();
		}
		int allXor = A[0];
		for(int i = 1; i < N; ++i){
			allXor ^= A[i];
		}
		StringBuilder sb = new StringBuilder();
		for(int a : A){
			if(sb.length() > 0){
				sb.append(' ');
			}
			sb.append(a ^ allXor);
		}
		System.out.println(sb);
	}
}
