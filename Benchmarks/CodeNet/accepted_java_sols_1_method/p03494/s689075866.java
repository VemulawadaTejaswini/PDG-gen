import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		N = sc.nextInt();
		int A=0;
		for(int i=0;i<N;++i) {
			A |= sc.nextInt();
		}
		System.out.println(Integer.numberOfTrailingZeros(A));
	}
}
