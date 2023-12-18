import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		long A=sc.nextLong();
		double B=sc.nextDouble();
		long x=(long)(B*100);
		long calc=A*x;
		long ans=(calc-calc%100)/100;
		System.out.println(ans);		
		
	}
}
