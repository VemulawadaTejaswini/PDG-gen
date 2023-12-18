import java.util.Scanner;


public class Main {

	static Scanner sc = new Scanner(System.in);
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		double input = sc.nextDouble();
		int answer = (int)Math.pow(input, 3.0);
		
		System.out.println(answer);
	}

}