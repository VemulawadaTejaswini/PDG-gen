import java.util.Scanner;


public class Main {
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int mod=(int)Math.pow(10,9)+7;
		
		long power=1;
		
		for(int i=1;i<=n;i++) {
			
			power=(power*i)%mod;
			
		}
		
		System.out.println(power);
		
		sc.close();


	}



}

