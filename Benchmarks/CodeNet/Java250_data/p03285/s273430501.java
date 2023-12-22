import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		for (int i=0;i*4<=N;i++) {
			if ((N-i*4)%7==0) {
				System.out.println("Yes");
				return ;
			}
		}
		System.out.println("No");
	}
}