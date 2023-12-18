import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strWord = sc.next().toLowerCase();
		int count = 0;
		if(strWord.length() <= 10) {
			String strT = new String();
			while(true) {
				strT = sc.next();
				if(strT.toLowerCase().equals(strWord)) {
					count++;
				}
				if(strT.equals("END_OF_TEXT")) {
					break;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}
}

