import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		long x = scan.nextLong();
		double n = 100;
		int year = 1;
		
		while(true) {
			n = Math.floor(n*1.01);
			if(n>=x) {
				System.out.println(year);
				System.exit(0);
			}else {
				year += 1;
			}
			
		}
		
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