import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();
		String str = scan.nextLine();
		String str_cha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

		int number = Integer.parseInt(num);
		for(int i = 0; i < str.length(); i++) {
			for(int j = 0; j < str_cha.length(); j++) {
				if(str.charAt(i) == str_cha.charAt(j)) {
					System.out.print(str_cha.charAt((j + number) % 26));
				}
			}
		}
		System.out.print("\n");
	}

}
