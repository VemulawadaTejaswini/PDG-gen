import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int years;
		int money=100000;
		Scanner scanner = new Scanner(System.in);
		years = scanner.nextInt();
		
		for(int i=0; i<years; i++){
			money *= 1.05;
			if(money % 1000 != 0){
				money = money / 1000;
				money = money * 1000;
				money += 1000;
			}
		}
		System.out.println(money);
	}

}