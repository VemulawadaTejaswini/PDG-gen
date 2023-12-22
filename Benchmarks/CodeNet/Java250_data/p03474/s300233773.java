import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = Integer.parseInt(sc.next());
		int B = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();
		
		boolean check = true;
		for(int i = 0; i < S.length(); i++) {
			if(i == A) {
				if(S.charAt(i) == '-') {
					continue;
				}else {
					check = false;
					break;
				}
			}else {
				if(S.substring(i, i + 1).matches("[0-9]")) {
					continue;
				}else {
					check = false;
					break;
				}
			}
		}
		System.out.println(check ? "Yes" : "No");
	}

}
