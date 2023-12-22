import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner date = new Scanner(System.in);

		String str = date.next();
		
		StringBuffer result = new StringBuffer(str);
		
		System.out.println(result.reverse());
		
	
	}

}