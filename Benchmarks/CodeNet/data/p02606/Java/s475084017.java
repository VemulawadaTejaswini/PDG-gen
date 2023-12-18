import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int l = s.nextInt();
		int r = s.nextInt();
		int d = s.nextInt();
		
		System.out.println(r/d-(l-1)/d);
	}

}