import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s= scan.nextInt();
		int w = scan.nextInt();
		
		if(s<=w) {
			System.out.println("unsafe");
		}else {
			System.out.println("safe");
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