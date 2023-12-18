import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder res = new StringBuilder();
		int n = sc.nextInt();
		int[] A = new int[n + 2];
		A[0] = A[n+1] = 0;
		int sum = 0;
		for(int i = 1; i <= n; i++) A[i] = Integer.parseInt(sc.next());
		for(int i = 0; i < A.length-1; i++) sum += Math.abs(A[i] - A[i+1]);
		for(int i = 1; i <= n; i++) {
			int dif = Math.abs(A[i-1] - A[i+1]) - Math.abs(A[i-1] - A[i])
					 - Math.abs(A[i] - A[i+1]);
			res.append(sum + dif + "\n");
		}
		System.out.print(res);
	}
}
