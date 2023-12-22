import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();
		String ans = "";
		for(int i=0; i< S.length(); i++){
			int count = (S.charAt(i)-'A' + N) % 26;
			ans = ans + String.valueOf((char)('A' + count));
		}

		System.out.println(ans);

	}

}