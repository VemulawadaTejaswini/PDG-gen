import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		char[] input;
		StringBuffer ret = new StringBuffer();
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine().toCharArray();
		for(int i = 0; i < input.length; i++) {
			char c = input[i];
			if (c >= 'A' && c <= 'C') {c += 26;}
			c -= 3;
			ret.append(c);
		}
		System.out.println(ret.toString());
	}
}