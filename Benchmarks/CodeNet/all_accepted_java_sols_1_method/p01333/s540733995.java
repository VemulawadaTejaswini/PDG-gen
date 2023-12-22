import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		while(true){
			int price=cin.nextInt();
			int money=cin.nextInt();
			if(price+money==0)break;
			price=money-price;
			int a=0,b=0,c=0;
			while(price>=1000){
				price-=1000;
				c++;
			}
			while(price>=500){
				price-=500;
				b++;
			}
			while(price>=100){
				price-=100;
				a++;
			}
			System.out.println(a+" "+b+" "+c);
		}

	}

}