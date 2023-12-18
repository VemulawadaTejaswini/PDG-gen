import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
//何人からもらうのか
		int N = sc.nextInt();
//いくらもらうのか
		double money = 0;
//円かビットコインか
		String u = "";
//答え
		double ans = 0;

		for(int i=0;i<N;i++) {

			money = sc.nextDouble();

			u = sc.next();

			if(u.equals("JPY")){
				ans += money;
			}else if(u.equals("BTC")){
				ans += ( money * 380000.0);
			}
		}

		System.out.println(ans);
	}

}