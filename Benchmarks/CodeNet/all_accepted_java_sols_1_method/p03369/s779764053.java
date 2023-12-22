import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner stdin = new Scanner(System.in);
		String s =stdin.next();
		int cnt=0;
		for(int i=0;i<3;i++) {
			if(s.charAt(i)=='o') {
				cnt++;
			}
		}
		System.out.println(100*cnt+700);


	}

}
