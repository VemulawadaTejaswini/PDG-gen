import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		while(s.hasNext()) {
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a + b;
			System.out.println(Integer.toString(c).length());
		}
	}
}