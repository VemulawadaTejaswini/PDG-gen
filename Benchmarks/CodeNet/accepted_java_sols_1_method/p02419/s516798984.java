import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String W = sc.next();
		int count =0;
		while(true) {
			String t = sc.next();
			if (t.equals("END_OF_TEXT")) {
				break;
			}
			t = t.toLowerCase();
			t = t.replace(".", "");
			if (t.equals(W)) {
				count++;
			}
		}
		System.out.println(count);
	}

}