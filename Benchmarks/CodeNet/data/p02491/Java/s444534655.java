import java.util.*;
public class Main{
	public static void main(String[] args) {
		int d,r;
		double f;
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		d=a/b;
		r=a%b;
		f=(float)a/b;
		System.out.printf(d+" "+r+" "+"%f",f);
	}
}