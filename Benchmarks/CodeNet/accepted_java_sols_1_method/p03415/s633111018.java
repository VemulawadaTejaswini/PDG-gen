import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(new File("Diagonal.txt"));

		char[][] a = new char[3][3];
		for (int i = 0; i < 3; i++) {
			String s = sc.nextLine();
			int j = 0;
			for (char c : s.toCharArray()) {
				a[i][j] = c;
				j++;
			}
		}

		System.out.println(""+a[0][0] + a[1][1]+a[2][2]);
	}
}