import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String in;
		while ((in = s.nextLine()) != "ENF OF INPUT") {
			String[] ss = in.split(" ");
			for (int i = 0; i < ss.length; i++) {
				System.out.print(ss[i].length());
			}
			System.out.println("");
		}
	}
}