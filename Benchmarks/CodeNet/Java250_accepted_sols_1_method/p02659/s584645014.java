import java.util.Scanner;

public class Main {
	static double eps=1.0E-14;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long a =scn.nextLong();
		long b =(long)((eps+scn.nextDouble())*100);
		long c =a*b/100;
		System.out.println(c);

	}

}