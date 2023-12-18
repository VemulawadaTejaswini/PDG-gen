//package Beg_167;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String s1 = a.nextLine();
		String s2=a.nextLine();
		
		boolean e = s1.contains(s2);
		boolean f = s2.contains(s1);
		boolean g = e||f;
		
		if (g) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}
}