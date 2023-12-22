import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static boolean isPalindrome(int n) {
		String s = ""+n;

		String a = "";
		for (int i = s.length()-1; i>=0; i--) {
			a += s.charAt(i);
		}

		return s.equals(a);
	}

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("B.txt"));

		int a = sc.nextInt();
		int b = sc.nextInt();

		int count = 0;
		for (int i = a; i <= b; i++) {
			if (isPalindrome(i)) count++;
		}

		System.out.println(count);
	}
}