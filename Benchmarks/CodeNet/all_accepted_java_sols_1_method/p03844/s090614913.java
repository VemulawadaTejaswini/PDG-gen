import java.io.*;
import java.util.*;


public class Main { // "Main" should be used for most online judges
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		String op = scanner.next();
		int b = scanner.nextInt();
		
		if (op.equals("+"))
		{
			System.out.print(a + b);
		}
		else
		{
			System.out.print(a - b);
		}
	}
}