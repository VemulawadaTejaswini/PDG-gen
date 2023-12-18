import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int payment = 0;
		for (int i = 0; i < n; i+=1000) {
			payment += 1000;
		}
		int exa = payment - n;
		System.out.println(exa);
	}
}
