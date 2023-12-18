import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int DP[] = new int[51];
		int pri[] = {0, 0, 380, 550, 0, 850};
		int num[] = {0, 0, 5, 4, 0, 3};
		double per[] = {0, 0, 0.8, 0.85, 0, 0.88};
		
		for(int i = 0; i <= 50; i++){
			DP[i] = Integer.MAX_VALUE;
		}
		
		DP[0] = 0;
		
		for(int space: new int[]{2,3,5}){
			for(int i = 50; i >= 0; i--){
				if(DP[i] != Integer.MAX_VALUE){
					int count = 0;
					for(int j = i; j <= 50; j += space, count++){
						if(count == 0){
							continue;
						}
						
						int next = DP[i] + (int)((count / num[space]) * num[space] * pri[space] * per[space]) + (count % num[space]) * pri[space];
						if(next < DP[j]){
							DP[j] = next;
						}
					}
				}
			}
		}
		
		while(true){
			int n = sc.nextInt();
			if(n == 0){break;}
			
			System.out.println(DP[n/100]);
			
		}
		
	}
}