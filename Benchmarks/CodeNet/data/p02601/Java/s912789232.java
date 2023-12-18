import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int red = in.nextInt(),gre = in.nextInt(),blue = in.nextInt(),k = in.nextInt();
		int c= 0;
		
		while(k-->0) {
		if(red> gre) {
			gre = gre * 2;
			c++;
		}
		if(gre>blue) {
			blue *=2;
			c++;
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
