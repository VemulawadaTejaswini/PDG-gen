import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max, min;
		min = Math.min(a, b);
		min = Math.min(min, c);
		max = Math.max(a, b);
		max = Math.max(max, c);

		System.out.println(min + " " + max);
	}

}

