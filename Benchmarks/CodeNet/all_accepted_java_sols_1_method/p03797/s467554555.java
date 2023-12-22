import java.util.Scanner;

public class Main {
	private static Scanner sc=new Scanner(System.in);
	private static long n=sc.nextLong();
	private static long m=sc.nextLong();
	public static void main(String[] args){
		if(2*n<=m) System.out.println((m-2*n)/4+n);
		if(2*n>=m) System.out.println(m/2);
	}
}