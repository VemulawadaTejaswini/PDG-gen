import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);

		String S = scanner.next();
		String T = scanner.next();
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String U = scanner.next();

		if(U.equals(S)){
			a -=1;
		}else{
			b -=1;
		}

		System.out.println(a +" " + b);
	}

}
