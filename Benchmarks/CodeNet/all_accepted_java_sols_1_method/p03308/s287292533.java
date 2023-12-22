import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int min = (int)Math.pow(10, 9);
		int max = 0;
		for(int i = 0; i < n; i++) {
		int a = scanner.nextInt();
		if(a > max) max = a;
		if(a < min) min = a;
		}
		System.out.println(max-min);
	}

}