import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = sc.next().split("");
		int count = 0;

		for(int i = 0;i < n-2;i++) {
			if(s[i].equals("A")) {
				if(s[i].concat(s[i+1]).concat(s[i+2]).equals("ABC")) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}