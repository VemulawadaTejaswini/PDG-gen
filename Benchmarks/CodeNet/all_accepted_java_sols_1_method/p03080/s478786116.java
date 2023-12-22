
import java.io.*;
import java.text.*;
import java.util.*;
 
public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int N = sc.nextInt();
		String s = sc.next();
		int count = 0;
		
		for (int i = 0; i < N; i++) {
			if (s.charAt(i) == 'R') {
				count++;
			}
		}
		String msg = "No";
		
		if (N / 2 < count) {
			msg = "Yes";
		}
		System.out.println(msg);
	}
}