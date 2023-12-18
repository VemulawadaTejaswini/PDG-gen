import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		if(H>N || W>N) {
			throw new RuntimeException("wrong");
		}
		if(H<N && W==N) {
			System.out.println(N-H+1);
		}
		if(H==N && W<N) {
			System.out.println(N-W+1);
		}
		if(H<N && W<N) {
			System.out.println((N-H+1)*(N-W+1));
		}
		if(H==N && W==N) {
			System.out.println(1);
		}
 	}
}
