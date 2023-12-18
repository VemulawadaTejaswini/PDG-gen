import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		sc.close();

		String[] aa = n.split("");
		int ans = 0;
		boolean flag = true;

		for(String str:aa) {
			if(str.equals("R")) {
				if(flag) {
					ans++;
				}else {
					ans = 1;
				}
			}else {
				flag = false;
			}
		}
		System.out.println(ans);

	}
}