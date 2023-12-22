import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int origin =sc.nextInt();
		int a = origin/100;
		int b = origin/10 -a*10;
		int c = origin - b*10 -a*100;
		System.out.print(a+b+c);

	}

}