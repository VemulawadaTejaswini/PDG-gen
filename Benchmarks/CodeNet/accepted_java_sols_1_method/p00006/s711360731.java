import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
	}

}