import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		if (N ==1) {
			System.out.println(M);
			return ;
		}
		for (int i=M/N;i>=0;i--) {
			if (M%i==0) {
				System.out.println(i);
				return ;
			}
		}
	}
}