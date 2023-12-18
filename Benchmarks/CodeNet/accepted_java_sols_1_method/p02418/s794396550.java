import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		String P = sc.nextLine();
		S = S+S;
		if (S.contains(P)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}

