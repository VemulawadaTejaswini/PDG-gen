import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int bill = sc.nextInt();
			if(bill==0) break;
			int coin_10 = sc.nextInt();
			int coin_50 = sc.nextInt();
			int coin_100 = sc.nextInt();
			int coin_500 = sc.nextInt();
			int pay_10, pay_50, pay_100, pay_500;
			int num;

			if(coin_10!=0){
				num = (bill%50)/10 + 5*(coin_10/5);
				if(num<=coin_10){
					pay_10 = num;
					bill -= pay_10 * 10;
				}else{
					if(num<5){
						pay_10 = 0;
					}else{
						pay_10 = num - 5;
					}
					bill -= pay_10 * 10;
				}
			}else{
				pay_10 = 0;
			}

			if(coin_50!=0){
				num = bill/50;
				if(bill%50!=0){
					bill = (num+1)*50;
					num++;
				}
				if((num%2+coin_50%2)%2==0){
					pay_50 = coin_50;
					bill -= pay_50 * 50;
				}else{
					if(coin_50!=0){
						pay_50 = coin_50 - 1;
					}else{
						pay_50 = 0;
					}
					bill -= pay_50 * 50; 
				}
			}else{
				pay_50 = 0;
			}

			if(coin_100!=0){
				num = bill/100;
				if(bill%100!=0){
					bill = (num+1)*100;
					num++;
				}
				num = (bill%500)/100 + 5*(coin_100/5);
				if(num<=coin_100){
					pay_100 = num;
					bill -= pay_100 * 100;
				}else{
					if(num<5){
						pay_100 = 0;
					}else{
						pay_100 = num - 5;
					}
					bill -= pay_100 * 100;
				}
			}else{
				pay_100 = 0;
			}

			if(coin_500!=0 && bill>0){
				if(bill%500==0){
					pay_500 = bill/500;
				}else{
					pay_500 = bill/500 + 1;
				}
			}else{
				pay_500 = 0;
			}

                        if(pay_10!=0){
				System.out.println("10 "+pay_10);
			}
			if(pay_50!=0){
				System.out.println("50 "+pay_50);
			}
			if(pay_100!=0){
				System.out.println("100 "+pay_100);
			}
			if(pay_500!=0){
				System.out.println("500 "+pay_500);
			}
		}
	}

}