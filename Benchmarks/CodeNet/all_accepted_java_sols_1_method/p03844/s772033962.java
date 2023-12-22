import java.util.*;
import java.math.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		char op = sc.next().charAt(0);
		int b=sc.nextInt();
		
		if(op=='+') {
			System.out.println(a+b);
		}else {
			System.out.println(a-b);
		}
	}

}
