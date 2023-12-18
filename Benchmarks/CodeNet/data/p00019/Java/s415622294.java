import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println(factorial(sc.nextLong()));
		sc.close();
	}
	
	static long factorial(long n) {
		return (n == 1)? 1: n * factorial(n-1);
	}
}