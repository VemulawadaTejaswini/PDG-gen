import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String n = scanner.next();
		int n4 = n.charAt(0)-'0';
		int n3 = n.charAt(1)-'0';
		int n2 = n.charAt(2)-'0';
		int n1 = n.charAt(3)-'0';
		if((n4==n3 && n3==n2 )||(n3==n2 && n2==n1) ){
			System.out.print("Yes");
		}else{
			System.out.print("No");
		}
	}
}