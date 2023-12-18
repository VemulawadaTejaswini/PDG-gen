import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int ninzuu = 0;
		
		D = D*2+1;
		do {
			N = N-D;
			ninzuu++;
		} while (N > 0);
		
		System.out.println(ninzuu);
		
		sc.close();
	}
}