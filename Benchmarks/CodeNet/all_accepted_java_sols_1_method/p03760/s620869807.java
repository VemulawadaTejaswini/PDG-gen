import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String O = scan.next();
		String E = scan.next();
		String[] pass1 = O.split("");
		String[] pass2 = E.split("");
		if(pass1.length == pass2.length) {
			for(int i = 0; i < pass1.length; i++) {
				System.out.print(pass1[i]);
				System.out.print(pass2[i]);
			}
		}else if(pass1.length > pass2.length) {
			for(int i = 0; i < pass2.length; i++) {
				System.out.print(pass1[i]);
				System.out.print(pass2[i]);
			}
			System.out.print(pass1[pass1.length-1]);
		}else if(pass2.length > pass1.length) {
			for(int i = 0; i < pass1.length; i++) {
				System.out.print(pass1[i]);
				System.out.print(pass2[i]);
			}
			System.out.print(pass2[pass2.length-1]);
		}
		scan.close();
	}
}
