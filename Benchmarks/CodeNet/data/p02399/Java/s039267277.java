import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = Integer.parseInt(s.next());
		int b = Integer.parseInt(s.next());
		
		System.out.print((a/b)+" ");
		System.out.print((a%b)+" ");
		
		System.out.print((float)((double)a /(double)b));
		
	}

}