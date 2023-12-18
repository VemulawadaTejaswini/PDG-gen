import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stringN = sc.nextLine();
		sc.close();

		long sn = 0;
		for(char c: stringN.toCharArray()) {
			sn += c-'0';
		}
//		System.out.println("\tsn:"+sn);

		System.out.println((Integer.parseInt(stringN)%sn == 0) ? "Yes" : "No");
	}
}
