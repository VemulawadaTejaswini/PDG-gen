import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int S = stdIn.nextInt();
		
		int h = S / 3600;
		S = S - h*3600;
		
		int m = S / 60;
		S = S - m*60;
		
		System.out.println(h+ ":" + m + ":" + S);
	}
}