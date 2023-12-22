import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int strlenge = scan.nextInt();
		
		String[] output = new String[count];
		for(int i = 0; i < count; i++) {
			 output[i] = scan.next();
		}
		Arrays.sort(output);
		for(int i = 0; i < count; i++) {
			 System.out.print(output[i]);
		}
		scan.close();
	}
}