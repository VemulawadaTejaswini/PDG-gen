
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		while(sc.hasNext()){
			int n = sc.nextInt();
			if(n == 0)break;
			
			int cnt = 0;
			for(int i=1;i<n;i++) {
				int sum = i;
				for(int j=i+1;j<n;j++) {
					if(sum+j == n) {
						cnt++;
						break;
					}
					if(sum+j < n) {
						sum += j;
						continue;
					}
					else break;
				}
			}
			
			System.out.println(cnt);
		}
		
	}
}
