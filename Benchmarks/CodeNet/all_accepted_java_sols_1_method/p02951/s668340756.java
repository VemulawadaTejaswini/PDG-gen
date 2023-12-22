import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sn = new Scanner(System.in);
		
		Integer a = sn.nextInt();
		Integer b = sn.nextInt();
		Integer c = sn.nextInt();
		
		int x = c - (a - b);
		
		System.out.println((x < 0) ? 0 : x);
	}
	
}