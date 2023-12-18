import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if((n|m)==0){
				return;
			}
			int[] map = new int[n+1];
			for(int i=1;i<=n;i++){
				map[i] = stdIn.nextInt();
			}
			int now = 1;
			int i = 1;
			for(;i<=m;i++){
				now += stdIn.nextInt();
				if(now>=n){
					break;
				}
				now += map[now];
				if(now>=n){
					break;
				}
			}
			System.out.println(i);
		}
	}
}