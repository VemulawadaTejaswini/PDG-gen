import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int a = 0;
		for(int i=0;i<m;i++) {
			a += scan.nextInt();
			if(a>n) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		
		System.out.println(n-a);
		
		
	}	
	
	
	//最小公約数
	/*
	static int gcd (int a, int b) {
		int temp;
		while((temp = a%b)!=0) {
			a = b;
			b = temp;
		}
		return b;
	}
	*/
	
}