import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		String stra = "";
		String strb = "";
		for(int i = 0; i < a; i++) {
			stra = stra + String.valueOf(b);
		}
		for(int i = 0; i < b; i++) {
			strb = strb + String.valueOf(a);
		}
		if(stra.compareTo(strb) <= 0) {
			System.out.println(stra);
		} else {
			System.out.println(strb);
		}
	}
}