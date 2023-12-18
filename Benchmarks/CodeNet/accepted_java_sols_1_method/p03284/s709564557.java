import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int K = scan.nextInt();
		int nk=N%K;
		
		if(nk==0) {
			System.out.print(0);
		}else {
			System.out.print(1);
		}
		
	}
}