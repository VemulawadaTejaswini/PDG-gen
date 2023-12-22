import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int K = sc.nextInt();
		sc.close();
		
		StringBuilder sb = new StringBuilder();
		int i = A;
		for(;i < A+K && i <= B;++i) {
			sb.append(i);
			sb.append('\n');
		}
		i = A+K-1 >= B-K+1 ? A+K : B-K+1;
		for(;i <= B;++i) {
			sb.append(i);
			sb.append('\n');
		}
		System.out.println(sb.toString());
	}
}
