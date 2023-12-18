import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int D,L,Ans = 0;

	private void mainrun() {
		scan = new Scanner(System.in);

		D = scan.nextInt();
		L = scan.nextInt();

		Ans += D / L + (D % L);

		System.out.println(Ans);

		scan.close();
	}

}
