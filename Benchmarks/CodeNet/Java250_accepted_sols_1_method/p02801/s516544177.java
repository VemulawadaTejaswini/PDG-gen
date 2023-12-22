import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		char[] a = stdIn.next().toCharArray();
		char b = ++a[0];
		System.out.println(b);
		
		
	}

}
