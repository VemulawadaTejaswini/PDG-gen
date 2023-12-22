import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] s,t;
		
		s = sc.next().toCharArray();
	    t = sc.next().toCharArray();
	    
	    if (s[0] == t[2] && s[1]==t[1] && s[2]==t[0]) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	
}