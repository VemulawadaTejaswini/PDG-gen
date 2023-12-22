import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		long ans = 0;
		
		if(k % 2 == 1) {
		double p =(double) (n / k);
		ans = (long)Math.pow(p, 3);
		System.out.println(ans);
		}
		
		if(k % 2 == 0) {
		int count1 = 0;
		int count2 = 0;
		
		for(int i = 1 ; i <= n ; i++) {
			if(i % k == k /2) 
				count1++;
			if(i % k == 0)
				count2++;
			}
		ans = (long)Math.pow(count1, 3) + (long)Math.pow(count2, 3);
		System.out.println(ans);
		}
	}
}


