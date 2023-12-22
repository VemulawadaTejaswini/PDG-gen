import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in).useDelimiter("(\\s|,)+");
		char posi = 'A';
		while (in.hasNext()) {
			char c1 = in.next().charAt(0);
			char c2 = in.next().charAt(0);
			if (c1 == posi) {
				posi = c2;
			} else if (c2 == posi) {
				posi = c1;
			}
		}
		System.out.println(posi);
	}
}