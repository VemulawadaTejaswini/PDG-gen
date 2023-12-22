import java.util.Scanner;
public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<3; i++) {
			String str = sc.next();
			String STR = str.toUpperCase();
			char moji = STR.charAt(0);
			System.out.print(moji);
		}
	}
}