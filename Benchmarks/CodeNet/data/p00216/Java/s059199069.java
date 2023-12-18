import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		int n,price,tmp;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			n = sc.nextInt();
			tmp = n%10;
			if(n == -1){
				break;
			}
			
			if(n < 10){
				price = 1150;
			}else if(n < 20){
				price = 1150+tmp*125;
			}else if(n < 30){
				price = 1150+1250+tmp*140;
			}else{
				tmp = n-30;
				price = 1150+1250+1400+tmp*160;
			}
			
			System.out.println(4280-price);
		}
	}
}