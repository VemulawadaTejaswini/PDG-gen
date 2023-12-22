import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		StringBuilder sb = new StringBuilder(str);
		sb.delete(0, 4);
		System.out.println(sb.insert(0, "2018"));

	}
}
