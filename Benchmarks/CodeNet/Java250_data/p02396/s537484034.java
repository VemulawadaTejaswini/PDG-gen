import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		int input, count = 1;
		
		while((input = kbScanner.nextInt()) != 0){
			System.out.println("Case " + count + ": " + input);
			count++;
		}
	}
}