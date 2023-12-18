import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String line = sc.nextLine();
		String[] inputs = line.split(" ");
		double ans = 0;

		for(int i = 0; i < num; i++){
			double money = sc.nextDouble();
			String currency = sc.next();

			if(currency.equals("BTC"))money *= 380000;
			ans += money;
		}

		System.out.println(ans);
	}
}


