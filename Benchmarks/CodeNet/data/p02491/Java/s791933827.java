import java.util.Scanner;


public class  Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;
		
		System.out.println(d + " " + r + " " + f);
		
	}

}