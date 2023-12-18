import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.nextLine();
		W = W.toLowerCase();
		int count = 0;
		for(int i=0;;i++) {
			String T = sc.next();
			if(T.equalsIgnoreCase(W)) {
				count++;
				i++;
			}
			if(T.equals("END_OF_TEXT")) break;

		}
		System.out.println(count);
	}
}

