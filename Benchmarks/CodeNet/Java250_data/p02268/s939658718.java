import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		int[] s = new int[n];
		
		for (int i = 0; i < n; i ++) {
			s[i]  = scanner.nextInt();
		}
		
		int q = scanner.nextInt();
		int c = 0;

		for (int i = 0; i < q; i ++) if (Arrays.binarySearch(s, scanner.nextInt()) >= 0) c ++;
		
		scanner.close();
		
		System.out.println(c);
	}
} 

