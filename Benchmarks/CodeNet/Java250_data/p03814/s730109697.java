import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int firstIndex = s.indexOf("A");
		int lastIndex = s.lastIndexOf("Z");
		System.out.println(lastIndex - firstIndex + 1);
		in.close();
	}
}