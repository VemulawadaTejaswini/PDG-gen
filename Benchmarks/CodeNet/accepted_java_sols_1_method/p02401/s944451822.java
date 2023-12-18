import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		while(true){
		int a = sc.nextInt();
		String p = sc.next();
		int b = sc.nextInt();

		if(p.equals("+")) {
			System.out.println(a + b);
		}
		else if(p.equals("-")) {
			System.out.println(a - b);
		}
		else if(p.equals("*"))
			System.out.println(a * b);
		else if(p.equals("/"))
			System.out.println(a / b);
		else if(p.equals("?"))
			break;
		}



	}

}
