import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long money = 100;
		int count = 0;
		while(true){
			money += money * 0.01;
			//System.out.println(money);
			count++;
			if(money >= X){
				System.out.println(count);
				return;
			}
		}
	}

}