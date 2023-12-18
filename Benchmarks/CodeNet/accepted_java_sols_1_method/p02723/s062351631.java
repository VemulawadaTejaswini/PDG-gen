import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		boolean ok = true;


		if(S.charAt(2) != S.charAt(3)) ok = false;
		if(S.charAt(4) != S.charAt(5)) ok = false;

		if(ok) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}


