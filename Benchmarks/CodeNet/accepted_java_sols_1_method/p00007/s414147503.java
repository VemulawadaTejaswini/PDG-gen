import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int money=100000;
		for(int i=0;i<a;i++){
			money*=1.05;
			int amari=money%1000;
			money-=amari;
			money+=amari==0 ? 0 : 1000;
		}
		System.out.println(money);
	}
}