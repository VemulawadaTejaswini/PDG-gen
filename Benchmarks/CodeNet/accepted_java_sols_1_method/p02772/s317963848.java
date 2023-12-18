import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i=0; i<N; i++) {
			int tmpA = sc.nextInt();
			if (tmpA%2 == 0) {
				if(tmpA % 5 == 0 || tmpA % 3 ==0);
				else {
					System.out.println("DENIED");
					return ;
				}
			}
		}
		
		System.out.println("APPROVED");

		sc.close();

	}
}