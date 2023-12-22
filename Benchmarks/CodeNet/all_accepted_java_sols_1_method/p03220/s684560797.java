import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int t = sc.nextInt();
		int a = sc.nextInt();
		
		double minDiff = 1000000.000;
		int ans = 0;
		
		for(int i = 0;i < n;i++){
			int h = sc.nextInt();
			double nowT = t - h*0.006;
			
			if(minDiff > Math.abs(nowT-a)){
				minDiff = Math.abs(nowT-a);
				ans = i+1;
			}
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}