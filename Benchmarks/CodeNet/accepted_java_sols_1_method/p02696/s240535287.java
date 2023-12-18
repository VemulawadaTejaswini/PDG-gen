import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long  a =scn.nextLong();
		long b =scn.nextLong();
		long n =scn.nextLong();
		long val = Math.min(b-1, n);
		System.out.println(a*val/b);

	}

}