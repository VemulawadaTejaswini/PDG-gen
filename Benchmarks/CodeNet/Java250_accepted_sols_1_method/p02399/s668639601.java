import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());
		
		System.out.printf("%d %d %.5f",a/b,a%b,(double)a/(double)b );
	}

}