import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		String a,b;
		int cnt=0;

		Scanner sc = new Scanner(System.in);

		a = sc.next();
		b = sc.next();

		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i)==b.charAt(i))
				cnt++;
		}

		System.out.println(cnt);
	}

}