import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();	
		int b = sc.nextInt();
		int c = sc.nextInt();
		int k = sc.nextInt();
		int value = 0;
		while (k > 0) {
			if (a!=0) {
				a--;
				k--; 
				value+=1;
			} else if (b != 0) {
				b--; k--; ;
			} else if (c != 0) {
				c--; k--; value-=1;
			} else {
				break;
			}
		}

		System.out.println(value);
	}
}
