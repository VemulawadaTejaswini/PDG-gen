import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double N=sc.nextDouble();
		double money=100;
		double count=0;
		while(money<(double)N) {
			money=money*1.01;
			count++;
			money=Math.floor(money);
		}
		System.out.println((int)count);
		sc.close();
	}
}
