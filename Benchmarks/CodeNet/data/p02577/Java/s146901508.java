import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String n = sc.next();
	
		int count = 0;
		for(int i = 0; i < n.length(); i++) {
			count += Character.getNumericValue(n.charAt(i));
		}
		
		if(count % 9 == 0) System.out.println("Yes");
		else System.out.println("No");
		
	}

}
