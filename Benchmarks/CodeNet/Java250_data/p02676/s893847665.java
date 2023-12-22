import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
		
		int m =scanner.nextInt();
		String a = scanner.next();
		int n= a.length();
		
		char[] c = a.toCharArray();
		
		for(int i = 0 ;i<n;i++) {
			if(i>m-1) {
				if(n>m) {
				System.out.println("...");
				}
				break;
			}
			System.out.print(c[i]);
		}		
	}
}