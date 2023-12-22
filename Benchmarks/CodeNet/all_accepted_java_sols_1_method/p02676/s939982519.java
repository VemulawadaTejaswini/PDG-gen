import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String n = sc.next();
		
		if(n.length() <= k) System.out.println(n);
		else System.out.println(n.substring(0, k) + "...");
		
	}

}
