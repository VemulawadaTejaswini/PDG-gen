import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		int red = in.nextInt(),gre = in.nextInt(),blue = in.nextInt(),k = in.nextInt();
		
		
		while(k-->0) {
		if(red> gre ||gre == red) {
			gre = gre * 2;
			
		}
		else if(gre>blue || gre == blue){
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
