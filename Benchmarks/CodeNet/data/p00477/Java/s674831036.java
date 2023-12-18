
import java.util.Scanner;
public class Main {
		
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int s = stdIn.nextInt();
		s += stdIn.nextInt();
		s += stdIn.nextInt();
		s += stdIn.nextInt();
		
		int m = s/60;
		s -= m * 60;
		System.out.println(m+"\n"+s);
	}
}