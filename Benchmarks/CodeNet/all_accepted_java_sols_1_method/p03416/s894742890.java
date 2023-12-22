import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int count = 0;
		for (int i=a;i<=b;i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(String.valueOf(i));
			sb.reverse();
			if(sb.toString().equals(String.valueOf(i))) {
				count++;
			}

		}
		System.out.println(count);
	}

}
