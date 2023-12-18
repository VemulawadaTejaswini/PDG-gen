import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String moji = sc.next();

		String mae = moji.substring(0,4);
		String ato = moji.substring(4,12);

		System.out.println(mae + ' ' + ato);
		sc.close();
	}

}
