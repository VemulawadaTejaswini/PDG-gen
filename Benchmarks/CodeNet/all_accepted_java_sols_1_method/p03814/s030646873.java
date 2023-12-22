import java.util.Scanner;

public class Main {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println(s.lastIndexOf("Z")-s.indexOf("A")+1);
	}

}