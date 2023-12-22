import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String[] judge = word.split("");

		int cnt = 0;

		for(int i = 0; i <= 2 ; i++) {

			if (judge[i].equals("1")) {
				cnt++;
			}else {
			}
		}
		System.out.println(cnt);
	}
}