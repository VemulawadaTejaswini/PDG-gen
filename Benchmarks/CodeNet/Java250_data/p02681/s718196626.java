//package Beg_167;
import java.util.*;

public class Main{
	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		String s1 = a.nextLine();
		String s2=a.nextLine();
		if ((s1.substring(0,s1.length()-1).equals(s2)) || (s2.substring(0,s2.length()-1).equals(s1))) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
a.close();
	}
}