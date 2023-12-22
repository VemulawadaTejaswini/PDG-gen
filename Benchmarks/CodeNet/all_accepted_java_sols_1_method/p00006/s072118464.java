import java.util.Scanner;

public class Main {
	public static void main(String[] argv) {
		Scanner input=new Scanner(System.in);
		StringBuffer sb= new StringBuffer(input.next());
		sb=sb.reverse();
		System.out.println(sb);
	}
}