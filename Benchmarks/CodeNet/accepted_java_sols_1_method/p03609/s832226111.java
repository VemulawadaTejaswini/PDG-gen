import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);	
		int x  = stdin.nextInt();
		int t= stdin.nextInt();
		if(x-t<0) {
			System.out.println(0);
		}else {
			System.out.println(x-t);
		}

		// TODO 自動生成されたメソッド・スタブ

	}

}