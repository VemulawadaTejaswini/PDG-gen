import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m = scn.nextInt();
		int val1=n*(n-1)/2;
		val1+=m*(m-1)/2;
		System.out.println(val1);

	}

}