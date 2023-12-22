import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		String str = null;
		char chr[];
		int kaikei = 700;

		Scanner scan = new Scanner(System.in);
		str = scan.next();

		chr = str.toCharArray();

		for(int i = 0 ; i < chr.length ; i++) {
			char kakunin = chr[i];
			if(kakunin == 'o') {
				kaikei = kaikei + 100;
			}
		}

		System.out.println(kaikei);

	}
}