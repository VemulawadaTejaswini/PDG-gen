import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int w = sc.nextInt();


		for(int i = 0; i < S.length(); i = i + w) {
		String ans = S.substring(i,i+1);

		System.out.print(ans);
		}
		sc.close();
	}

}