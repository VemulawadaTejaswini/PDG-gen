import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		int count = 0;
		for(int i = 0; i < 3; ++i) {
			if(str.charAt(i) == '1') {
				count++;
			}
		}
		System.out.println(count);
		scan.close();
	}
}
