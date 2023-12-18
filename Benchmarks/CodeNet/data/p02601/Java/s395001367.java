import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int red = in.nextInt(),gre = in.nextInt(),blue = in.nextInt(),k = in.nextInt();
		
		
		while(k-->0) {
		if(red> gre) {
			gre = gre * 2;
			
		}
		else {
			blue*=2;
		}
		
		}
		
		if(red<gre && gre<blue) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
			
			

	}
}
