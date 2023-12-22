import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String in =sc.next(); 
		
		int a = Integer.parseInt(in.substring(0, 1));
		int b = Integer.parseInt(in.substring(1, 2));
		int c = Integer.parseInt(in.substring(2, 3));
		
		System.out.println(a+b+c);
	}
}
