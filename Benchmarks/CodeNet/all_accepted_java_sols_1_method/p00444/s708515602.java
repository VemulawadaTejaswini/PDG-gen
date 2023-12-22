import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int money = 1000 - stdIn.nextInt();
			if(money==1000){
				return;
			}
			
			int coin = 0;
			if(money>=500){
				money-=500;
				coin++;
			}
			if(money>=100){
				int tmp = money/100;
				money-=tmp*100;
				coin+=tmp;
			}
			if(money>=50){
				money-=50;
				coin++;
			}
			if(money>=10){
				int tmp = money/10;
				money-=tmp*10;
				coin+=tmp;
			}
			if(money>=5){
				money-=5;
				coin++;
			}
			coin+=money;
			System.out.println(coin);
		}
	}
}