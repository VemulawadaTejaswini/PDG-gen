import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner stdin=new Scanner(System.in);
		String s=stdin.next();
		StringBuilder sb=new StringBuilder();
		sb.append(s);

		sb.replace(0, 4, "2018");
		System.out.println(sb);
	}
}
