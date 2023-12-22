import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String S = s + s;
		String P = sc.next();

		boolean flag = false;
		for(int i = 0; i <= S.length() - P.length(); i++) {
			if(S.substring(i, i + P.length()).equals(P)){
				flag = true;
				break;
			}
		}

		if(flag) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}
}
