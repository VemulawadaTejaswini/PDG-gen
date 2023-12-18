import java.util.Scanner;

class Main2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String S = sc.next();
		int count = 0;

		S = S.replaceAll("\\?", "D");
		System.out.println(S);
	}


}
