import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String N = sc.next();
		sc.close();

		int num = Integer.parseInt(N);

		int xx = 0;
		for(int i = 0; i < N.length(); i++) {
			String a = N.substring(i, i+1);
			xx += Integer.parseInt(a);
		}

		if(num % xx == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
