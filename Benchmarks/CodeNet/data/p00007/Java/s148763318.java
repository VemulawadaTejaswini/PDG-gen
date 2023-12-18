import java.util.Scanner;


public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n=scan.nextInt();
		int debt=100000;
		int temp;
		double interest = 0.05;

		for(int i=1;i<=n;i++){
			debt+=debt*interest;
			temp=debt%1000;
			if(temp>0){
				debt=debt-temp+1000;
			}
		}
		System.out.println(debt);
	}

}