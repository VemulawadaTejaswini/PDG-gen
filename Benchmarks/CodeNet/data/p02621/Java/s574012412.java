package atcoder.biginner.contest172.a;
import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		check = a;
		double b=a+Math.pow(a,2)+Math.pow(a,3);
		
		a=a+a*a+a*a*a;
		
		System.out.println(a);
	}	
}