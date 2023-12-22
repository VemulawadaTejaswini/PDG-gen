import java.util.Scanner;
import java.io.*;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k= sc.nextInt();
		int cnt = 0;
		while(true) {
			if(a >= b) {
				b *= 2;
				++cnt;
			}
			if(a < b || cnt > k) {
				break;
			}
		}
		while(true) {
			if(b >= c) {
				c *= 2;
				++cnt;
			}
			if(b < c || cnt > k) {
				break;
			}
		}
		if(cnt > k) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}
	
}
