import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		String b = scan.next();
		
		String[] a1 = a.split("");
		String[] b1 = b.split("");
		
		boolean judge = false;
		
		for(int i = 0; i < a1.length; i++) {
			if(a1[i].equals(b1[i])) {
			}
			else {
				judge = true;
			}
		}
		
		if(judge == false) {
			System.out.println("Yes");
		}
		else if(judge == true) {
			System.out.println("No");
		}
	}

}
