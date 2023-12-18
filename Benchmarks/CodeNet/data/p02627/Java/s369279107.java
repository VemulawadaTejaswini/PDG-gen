import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String a = scan.next();
		
		if (String.toUpperCase(a).equals(a)) {
			System.out.println("A");	// 大文字
		}
		else {
			System.out.println("a");	// 小文字
		}
		
		scan.close();
	}
}
