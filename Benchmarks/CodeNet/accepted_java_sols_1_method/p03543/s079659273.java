import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();

		int cnt = 0;
		char c = 'a';

		for (char s : S.toCharArray()){
			if (s == c){
				cnt++;
			}else {
				cnt = 0;
			}

			if (cnt >= 2){
				System.out.println("Yes");
				return;
			}
			c = s;
		}
		System.out.println("No");
		return;
	}
}
