import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scannerS = new Scanner(System.in);
		String s = scannerS.nextLine();

		char s0 = s.charAt(0);
		String ss = s.substring(2, s.length() - 1);
		char sl[] = s.toCharArray();
		int lower = 0;


		for (int i = 0; i < s.length(); i++) {
			if (sl[i] <= 'z' && sl[i] >= 'a')
				lower++;
		}
		//      System.out.println(lower);

		//	    System.out.println(ss);


		int count = 0;
		for (int i = 0; i < ss.length(); i++) {
			if (ss.charAt(i) == 'C')
				count++;
		}

		//	    System.out.println(count);

		if (s0 == 'A' && count == 1 && lower==s.length()-2) {
			System.out.println("AC");
		}else {
			System.out.println("WA");
		}

	}

}