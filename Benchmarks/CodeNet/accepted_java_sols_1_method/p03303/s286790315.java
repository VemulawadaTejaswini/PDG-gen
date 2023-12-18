import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		int w = in.nextInt();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<str.length();i=i+w) {
			sb.append(str.charAt(i));
		}
		System.out.println(sb.toString());
	}
}
