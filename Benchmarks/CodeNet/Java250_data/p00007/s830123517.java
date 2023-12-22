
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int week = sc.nextInt();
		long money = 100000;
		
		for(int i = 0; i < week; i++){
			money += getInterest(money);
			money = revaliationMoney(money);
		}
		
		System.out.println(money);
	}
	
	private static long getInterest(long money){
		return money * 5 / 100;
	}
	
	private static long revaliationMoney(long money){
		long fraction = money % 1000;
		if(fraction != 0){
			money = money - fraction;
			return money + 1000;
		}
		else{
			return money;
		}
	}
}