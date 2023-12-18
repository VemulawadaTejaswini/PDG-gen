
import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// try{
		// BufferedReader fin=new BufferedReader(new
		// FileReader("./2001-input.txt"));

		while (true) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a = sc.nextInt();
			if (n == 0 && n == m && n == a) break;
			int[][] list = new int[n + 1][m + 1];

			for (int i = 0; i < m; i++) {
				int h = sc.nextInt();
				int p = sc.nextInt();
				int q = sc.nextInt();

				list[p][h] = q;
				list[q][h] = p;
			}

			int here = a;
			int length = m;
			while (true) {
				if (length == 0) break;
				if (list[here][length] != 0) {
					here = list[here][length];
				}
				length--;

			}
			System.out.println(here);
		}
	}

}