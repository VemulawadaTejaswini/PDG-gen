import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		str = new StringBuffer(str).reverse().toString();
		System.out.println(str);
		in.close();
	}
}
