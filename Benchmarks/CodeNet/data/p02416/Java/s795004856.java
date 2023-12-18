import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		while(true) {
			String str = sc.next();
			if(str.equals("0")) break;

			int n = str.length();
			char[] c = str.toCharArray();
			int num[] = new int[n];
			int sum = 0;

			for(int i = 0; i < n; i++) {
				num[i] = (int)c[i] - 48;
				sum += num[i];
			}
			System.out.println(sum);
		}
	}
}

