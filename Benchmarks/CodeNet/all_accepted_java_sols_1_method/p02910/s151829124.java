import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		boolean check = true;
		for(int i = 0; i < S.length(); i++) {
			if(i % 2 == 0) {
				if(S.charAt(i) == 'L') {
					check = false;
					break;
				}else {
					continue;
				}
			}else {
				if(S.charAt(i) == 'R') {
					check = false;
					break;
				}else {
					continue;
				}
			}
		}
		System.out.println(check ? "Yes" : "No");
	}

}