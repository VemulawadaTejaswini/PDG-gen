import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int x = in.nextInt();
		while(n != 0 || x != 0){
			int cnt = 0;
			for(int i = 1; i <= n; i++){
				for(int k = i + 1; k <= n && i + k < x; k++){
					for(int m = k + 1; m <= n && i + k + m <= x; m++){
						if(i + k + m == x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
			n = in.nextInt();
			x = in.nextInt();
		}
	}	
}