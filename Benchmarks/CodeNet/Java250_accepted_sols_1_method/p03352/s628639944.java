import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int ans = 1;
		for(int b=2;b<X;b++) {
			for(int p=2;(int)Math.pow(b,p)<=X;p++) {
				if(ans <= Math.pow(b,p)) {
					ans = (int) Math.pow(b,p);
				}
			}
		}
		System.out.println(ans);
	}

}