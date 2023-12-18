import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			final int n = sc.nextInt();
			final int m = sc.nextInt();
			
			if(n == 0 && m == 0){
				break;
			}
			
			int[] masu = new int[n];
			
			for(int i = 0; i < n; i++){
				masu[i] = sc.nextInt();
			}
			
			int cur = 0;
			int count = 0;
			for(int i = 0; i < m; i++){
				if(cur >= n - 1){
					sc.nextInt();
					continue;
				}
				
				cur += sc.nextInt();
				count++;
				
				if(cur >= n - 1){
					continue;
				}else{
					cur += masu[cur];
				}
			}
			
			System.out.println(count);
		}
		
	}

}