import java.util.Scanner;


import java.util.Comparator;
import java.util.Arrays;
import java.util.ArrayList;



public class Main {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		char s1 = S.charAt(0);
		char s2 = S.charAt(1);
		char s3 = S.charAt(2);
		char s4 = S.charAt(3);
		if (s1 == s2) {
			if(s3 == s4 && s1 != s3) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		else {
			if((s1 == s3 && s2 == s4) ||(s1 == s4 && s2 == s3) ) {
				System.out.println("Yes");
			}
			else {
				System.out.println("No");
			}
		}
		
	}
}
