import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		
		if(a<b) {
			if(b<c) {
				if(b<c) {
					System.out.println(a + " " + b + " " + c);
				}
				
				else {
					System.out.println(a + " " + c + " " + b);
				}
			}else {
				System.out.println(c+ " " + a + " " + b);
			}
				
				
		}else {
			if(b<c) {
				if(c<a) {
					System.out.println(b + " " + c + " " + a);
				}
				
				else {
					System.out.println(b + " " + a + " " + c);
				}
			}else {
				System.out.println(c+ " " + b + " " + a);
		
			}

		}

	}
}

