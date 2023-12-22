import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		StringBuffer sb = new StringBuffer(str).reverse();
		
		System.out.println(sb);

	}

}