import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		String str = scan.next();
		int l = str.length();
		String rts ="";
		for(int i = l -1;i >= 0 ;i--){
			rts = rts + str.charAt(i);
		}
		System.out.println(rts);
		System.exit(0);
	}
}