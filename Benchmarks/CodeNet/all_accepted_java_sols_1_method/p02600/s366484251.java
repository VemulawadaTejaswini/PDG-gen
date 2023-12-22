import java.util.Scanner;
import java.io.*;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		x /= 100;
		if(x < 6) {
			System.out.println(8);
		}else if(x < 8) {
			System.out.println(7);
		}else if(x < 10) {
			System.out.println(6);
		}else if(x < 12) {
			System.out.println(5);
		}else if(x < 14) {
			System.out.println(4);
		}else if(x < 16) {
			System.out.println(3);
		}else if(x < 18) {
			System.out.println(2);
		}else if(x < 20) {
			System.out.println(1);
		}
	}
	
}
