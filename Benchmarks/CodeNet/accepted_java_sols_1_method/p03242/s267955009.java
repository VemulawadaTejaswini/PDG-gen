import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		scan.close();
		for(int i = 0; i < n.length(); i++) {
			if(n.charAt(i) == '9') {
				System.out.print(1);
			}else if(n.charAt(i) == '1') {
				System.out.print(9);
			}else {
				System.out.print(n.charAt(i));
			}
		}
		System.out.println();
	}
}