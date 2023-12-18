import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int Amm = scan.nextInt();
		int Bmm = scan.nextInt();
		int Cmm = scan.nextInt();

		System.out.println(Amm-Bmm >= Cmm?0:Bmm+Cmm-Amm);

		scan.close();

	}

}
