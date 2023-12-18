import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String id = sc.next(); //ID
		String id2 = sc.next(); //ID

		int cnt = id.length();
		int cnt2 = id2.length();

		String id3 = id2.substring(cnt);

		if(id.equals(id2.substring(0, cnt)) && id3.length() == 1) {
			System.out.print("Yes");
		}else {
			System.out.print("No");
		}
	}

}
