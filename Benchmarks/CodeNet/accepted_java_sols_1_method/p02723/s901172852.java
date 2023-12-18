
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		if(s.charAt(2)==s.charAt(3) && s.charAt(4)==s.charAt(5)) System.out.print("Yes");
		else System.out.println("No");
	}
	
}