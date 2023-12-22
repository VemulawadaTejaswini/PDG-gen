import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);

		//入力表示
		String  a = scanner.next();
		String  b = scanner.next();
		
		//文字の繰り返し表示
		String c = "";
		for(int i =0; i<Integer.parseInt(b); i++) {
			c=c+a;
		}
		
		String d = "";
		for (int i =0; i<Integer.parseInt(a); i++) {
			d=d+b;
		}
		
		if (c.compareTo(d) == 0) {
			System.out.println(c);
	
		}
		if (c.compareTo(d) < 0) {
			System.out.println(c);
		}
		
		if (c.compareTo(d) > 0) {
			System.out.println(d);
		}

		scanner.close();
	}
}
