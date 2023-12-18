import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char s[] = new char[4];
		int think = 0;
		for(int i = 0; i < 4; i++) {
			s[i] = S.charAt(i);
			if(s[i] == '+')think++;
			else if(s[i] == '-')think--;

		}
		System.out.println(think);

	}

}
