import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str;
		char ch;
		int num;
		int answer = 1;

		num = scan.nextInt();
		str = scan.next();
		ch = str.charAt(0);

		for(int i = 1; i < num; i++) {
			if(str.charAt(i) != ch) {
				answer++;
				ch = str.charAt(i);
			}
		}

		System.out.println(answer);

	}
}
