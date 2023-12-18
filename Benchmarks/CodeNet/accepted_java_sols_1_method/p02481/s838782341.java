import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner (System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int men, shu;
		
		men = a * b;
		shu = (a + b) * 2;
		
		System.out.println(men + " " + shu);

	}

}