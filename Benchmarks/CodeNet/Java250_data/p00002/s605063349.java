import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		int a,b,sum;
		
		while (sc.hasNextInt()) {
			a = sc.nextInt();
			b = sc.nextInt();
			
			sum = a + b;
			
			System.out.println(Integer.toString(sum).length());
		}
	}
}