import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		int fx =0;
		for (int i=0;i<x.length();i++) {
			fx = fx + Character.getNumericValue(x.charAt(i));
		}
		//System.out.println(x.charAt(1));
		if(Long.parseLong(x)%(long)fx==0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}

}
