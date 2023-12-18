

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(func(n));
	}
	
	public static long func(int n) {
		if (n == 1) return 1;
		return n * func(n - 1);
	}

}