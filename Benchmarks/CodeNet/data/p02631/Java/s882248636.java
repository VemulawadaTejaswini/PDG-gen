import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		int A[] = new int[N];
		int result =0;
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
			result=result^A[i];
		}
		for (int i=0;i<N;i++) {
			System.out.print(result^A[i]);
			System.out.print(" ");
		}
	}
}
