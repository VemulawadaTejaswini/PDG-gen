import java.util.*;
import java.lang.*;

public class Main {
	public static void main(String[] args){

		Scanner scn = new Scanner(System.in);
		
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		
		int tmp;
		if (a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		if (b > c){
			tmp = b;
			b = c;
			c = tmp;
		}
		if (a > b){
			tmp = a;
			a = b;
			b = tmp;
		}
		System.out.println(a + " " + b + " " + c);
	}
}