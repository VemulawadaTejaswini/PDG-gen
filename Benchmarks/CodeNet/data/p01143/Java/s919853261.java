import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		while(true){
			int n = scan.nextInt();
			int m = scan.nextInt();
			int p = scan.nextInt();
			int sum=0,hit=0;

			if(n==0 && m==0 && p==0) break;

			for(int i=1;i<=n;i++){
				int x = scan.nextInt();

				sum += x * 100;
				if(i == m){
					hit = x;
				}
			}

			sum = (int)(sum * ((100.0 - p) / 100.0));
			if(hit == 0){
				System.out.println("0");
			}
			else{
				System.out.println(sum / hit);
			}
		}
	}
}