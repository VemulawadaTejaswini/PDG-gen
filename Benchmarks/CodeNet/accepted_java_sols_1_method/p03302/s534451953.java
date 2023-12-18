import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		if(a * b == 15)System.out.println('*');
		else if(a + b == 15)System.out.println('+');
		else System.out.println('x');
	}
}
