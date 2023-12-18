import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		for(int i = 0; i < N; i++) {
			int n = sc.nextInt();
			A.add(n);
			B.add(0);
		}
		for(int i = 0; i < N; i ++) {
			B.set(A.get(i) - 1, i + 1);
		}
		for(int i = 0; i < N; i++) {
			System.out.print(B.get(i) + " ");
		}
		sc.close();
	}
}