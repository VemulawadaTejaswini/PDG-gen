import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] ar = new int[n];
		for (int i=0;i<n;i++) {
			ar[i] = s.nextInt();
		}
		System.out.println(lcm(ar));
	}
	public static int gcd(int x, int y) {if (y==0) {return x;}return gcd(y,x%y);}
	public static int lcm(int... x) {
		int tmp=x[0];
		for (int i=1;i<x.length;i++) {
			int gcd = gcd(tmp,x[i]);
			tmp = tmp*x[i]/gcd;
		}
		return tmp;
	}

}