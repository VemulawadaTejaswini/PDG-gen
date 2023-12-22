
import java.util.*;
public class Main {
	public static void main ( String [] args) {
		Scanner input = new Scanner (System.in);
		int x = input.nextInt();
		int h = (x/500)*1000;
		int f = ((x%500)/5)*5;
		System.out.println(h+f);
		
	}

}