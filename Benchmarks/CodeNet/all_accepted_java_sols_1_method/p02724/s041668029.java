import java.io.IOException;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		int n =  Integer.parseInt(sc.next());
		int a = 0;
		int b = 0;
		
		a = n / 500;
		n = n % 500;
		b = n / 5;
		
		System.out.println((a*1000)+(b*5));
		
		}
}