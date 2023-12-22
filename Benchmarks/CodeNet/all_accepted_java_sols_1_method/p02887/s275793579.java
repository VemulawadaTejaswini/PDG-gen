import java.io.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		char[] s =sc.nextLine().toCharArray();
		int total = 0;
		for (int i = 0, j = 0; i < n; i = j) {
		    while (j < n && s[i] == s[j])
		        j++;

		    total++;
		}
		
		System.out.println(total);

	}

}
