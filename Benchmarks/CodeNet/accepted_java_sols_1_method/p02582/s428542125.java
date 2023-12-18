import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String S = scan.next();

		if(S.equals("RRR")) {
			System.out.println(3);
		}else if(S.equals("RRS") || S.equals("SRR")) {
			System.out.println(2);
		}else if(S.equals("SSS")) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}

	}
}