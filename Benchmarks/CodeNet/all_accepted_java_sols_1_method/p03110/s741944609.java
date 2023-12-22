

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		double x=0;
		String u="";
		double sum=0;
		double btc=380000.;
		
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++){
			x=sc.nextDouble();
			u=sc.next();
			if(u.equals("BTC"))x=x*btc;
			sum=sum+x;
		}
		System.out.println(sum);
	}

}
