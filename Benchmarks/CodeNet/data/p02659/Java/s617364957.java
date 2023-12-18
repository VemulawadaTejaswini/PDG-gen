import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		double m = sc.nextDouble();
		double nn = n/100.00;
		long res = (long) (m * nn * 100.00);
		System.out.println(res);
	}
}
