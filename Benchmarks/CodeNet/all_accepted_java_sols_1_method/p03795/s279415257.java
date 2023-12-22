//package abc055a;

import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int n, x, y, ans = 0;
		
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		x = 800 * n;
		y = 200 * (n / 15);
		ans = x - y;
		System.out.println(ans);
	}

}
