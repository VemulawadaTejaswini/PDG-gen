import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int w = sc.nextInt();
		
		for (int i = 0; i < S.length(); i++) {
			if (i == 0 || i % w == 0) {
				System.out.print(S.charAt(i));
			}
		}

	}
}