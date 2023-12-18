import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scan = new Scanner(System.in);
		
		long a = scan.nextLong();
		double b = scan.nextDouble();
		 
		
		long ans = (long) (a * (b * 100) / 100);
		
		System.out.println(ans);
		
		}

}
