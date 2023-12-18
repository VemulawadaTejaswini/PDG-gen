import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.next();
		String xx = "";
		
		for(int i=0;i<S.length();i++) {
			xx += "x";
		}
		
		System.out.println(xx);
	}
}