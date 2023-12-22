import java.util.Scanner;

class Main {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		
		System.out.println(700 + S.replaceAll("x", "").length()*100);
		
	}
}