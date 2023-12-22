//atcb095b.java
import java.io.*;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] m = new int[n];
		int sum, ans=0, min=1000;

		for (int i=0; i<n; i++) {
			m[i] = sc.nextInt();
			if(m[i] < min) min = m[i];
			x -= m[i];
			ans++;
		}
		ans = ans + x/min;
		System.out.println(ans);
		sc.close();
	}
}	
