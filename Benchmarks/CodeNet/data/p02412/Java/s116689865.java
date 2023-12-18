import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i, j, k, cnt = 0;
		int n, x;
		int[] ans = new int[100];
		
		for(i = 0; i < 100; i++){
			ans[i] = 0;
		}
		
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			
			if(n == 0 && x == 0){
				break;
			}
			
			for(i = 1; i <= n - 2; i++){
				for(j = i + 1; j <= n - 1; j++){
					for(k = j + 1; k <= n; k++){
						if(i + j + k == x){
							ans[cnt] ++;
						}
					}
				}
			}
			
			cnt ++;
		}
		
		for(i = 0; i < cnt; i++){
			System.out.println(ans[i]);
		}
	}
}