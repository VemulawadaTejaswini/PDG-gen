import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		String nS = a+b;
		int n = Integer.parseInt(nS);
		double nh = Math.sqrt((double)n);
		if(nh-(int)nh==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
