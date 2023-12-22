import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int k = scan.nextInt();
		int ans = 0;
		
		for(int i=0;i<k;i++) {
			if(a>=1) {
				ans += 1;
				a -= 1;
			}else if(b>=1) {
				b -= 1;
			}else {
				ans -= 1;
				c -= 1;
			}
		}
		
		System.out.println(ans);
		
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
	
	//入れ替え
	/*
	static int swap (int a, int b) {
		int swap_arr[] = new int[2];
		
		swap[0] = b;
		swap[1] = a;
		
		return swap_arr;
	}
	*/
	
}
