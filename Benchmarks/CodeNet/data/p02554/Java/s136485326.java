import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		if(n == 1) System.out.println("0");
		else{
			int juu = (n - 2) / 10;
			int amari = (n - 2) % 10;
			
			
			long ans = 0;
			if(juu > 0) {
				long temp = 1;
				for(int i = 0; i < juu; i++) {
					temp = (long) (temp * (Math.pow(10, 10) % (Math.pow(10, 9) + 7))); 
					if(temp > (Math.pow(10, 9) + 7)) temp %= Math.pow(10, 9) + 7;
				}
				
				temp =  (long) (temp * Math.pow(10, amari));
				if(temp > (Math.pow(10, 9) + 7)) temp %= Math.pow(10, 9) + 7;
				
				temp = (n - 1) * temp;
				if(temp > (Math.pow(10, 9) + 7)) temp %= Math.pow(10, 9) + 7;
				
				temp = n * temp;
				if(temp > (Math.pow(10, 9) + 7)) temp %= Math.pow(10, 9) + 7;
				
				ans = temp;
			}
			else {
				long temp = (long) Math.pow(10, amari);
				temp = (n - 1) * temp;
				if(temp > (Math.pow(10, 9) + 7)) temp %= Math.pow(10, 9) + 7;
				
				temp = n * temp;
				if(temp > (Math.pow(10, 9) + 7)) temp %= Math.pow(10, 9) + 7;
				
				ans = temp;
			}
			
			System.out.println(ans);
		}
		
	}

}
