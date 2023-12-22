import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        int money = sc.nextInt();

		        int point = 0;
		        //moneyが5以上ならくり返す
		        while(money >= 5) {
		        	//moneyが500以上か
		        	if(money >=500){
		        		point += 1000;
		        		money -= 500;
		        	}
		        	else if(money >= 5) {
		        		point += 5 ;
		        		money -= 5;
		        	}


		        }
		        System.out.println(point);
	}


}
