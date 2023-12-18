import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		char[] list = str.toCharArray();
		char b = list[0];
		boolean ch = false;
		for(int i = 1; i<4; i++) {
			if(b == list[i]) {
				ch = true;
				break;
			}else {
				b = list[i];
			}
		}
		if(ch) System.out.println("Bad");
		else System.out.println("Good");
	}
}