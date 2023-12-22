import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		final int K = scan.nextInt();
		final int X = scan.nextInt();

		for(int i = 0;i < 2*K-1;i++){
			System.out.println(X - (K-1) + i);
		}
	}
}