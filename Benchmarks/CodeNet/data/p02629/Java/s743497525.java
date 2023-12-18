import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(alphabet(sc.nextLong()));
	}
	
	public static String alphabet(long num) {
		int firstAlpha = (int)'a';
		int sizeAlpha = 26;

		if (num <= sizeAlpha) {
			return String.valueOf((char)(firstAlpha + num - 1));
		} else {
			long offset = num - 1;
			long tmp = offset;
			String str = "";
			while(true) {
				long div = tmp / sizeAlpha;
				long m = tmp % sizeAlpha;
				str = alphabet(m + 1) + str;
				if (div <= 0)
					break;
				tmp = (div - 1);
			}
			return str;
		}
	}
}
