import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String W = scan.next().toLowerCase();
		String str;
		int count = 0;
		while (true) {
			str = scan.next();
			if (str.equals("END_OF_TEXT")) break;
			str = str.toLowerCase();
			if (str.equals(W)) count++;
		}
		System.out.println(count);
	}

}