import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.nextLine();
		int length = -1;
		for(int i = S.length() - 2; i >= 2; i -= 2) {
			if(S.substring(0, i / 2).equals(S.substring(i / 2, i))) {
				length = i;
				break;
			}
		}
		System.out.println(length);
		scan.close();
	}

}
