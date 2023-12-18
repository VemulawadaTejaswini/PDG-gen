import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			int c = i;
			int isum = 0;
			while(c > 0) {
				isum += c % 10;
				c = c / 10;
							
			}
			if (isum >= a && isum <= b)
				sum += i;
			
		}
		System.out.println(sum);
	}

}
