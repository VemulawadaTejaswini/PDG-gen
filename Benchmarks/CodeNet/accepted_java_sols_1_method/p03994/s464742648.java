import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int num = scanner.nextInt();
		scanner.close();
		char[] alphabet = str.toCharArray();
		for (int i = 0; i < alphabet.length; i++) {
			int tem = alphabet[i];
			int temDif = 123 - tem;
			if (temDif <= num && temDif != 26) {
				alphabet[i] = 'a';
				num = num - temDif;
			}
		}
		if (num > 0) {
			int tem = alphabet[alphabet.length - 1];
			tem = (tem + num -97) % 26 + 97; 
			alphabet[alphabet.length - 1] = (char) tem;
		}
		str = new String(alphabet);
		System.out.println(str);
	}
}
