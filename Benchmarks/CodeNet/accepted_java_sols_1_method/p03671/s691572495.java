import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int max=0;
		max =Math.max(max, a);
		max=Math.max(max, b);
		max=Math.max(max, c);
		System.out.println((a+b+c-max));
	}

}
