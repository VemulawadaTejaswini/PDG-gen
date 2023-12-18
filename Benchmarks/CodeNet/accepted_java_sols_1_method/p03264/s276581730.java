
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int K = in.nextInt();
		int a =K/2;
		if(K%2==1) {
			System.out.print(a*(a+1));	
		}else {
			System.out.print(a*a);
			
		}

	}
}
