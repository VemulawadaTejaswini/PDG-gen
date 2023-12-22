

import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int R = sc.nextInt();
		
		int sum=P+Q;
		if(sum>Q+R) {
			sum=Q+R;
			if(sum>P+R) sum=P+R;
		}
		
		if(sum>P+R){
			sum=P+R;
			if(sum>Q+R) sum=Q+R;
		}
		
		System.out.print(sum);
		
	}

}
