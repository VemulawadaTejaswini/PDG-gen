import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int x = scn.nextInt();
		int cnt = 0;
		while(n != 0 || x != 0){
			for(int i = 1; i <= n; i++){
				for(int j = i + 1; j <= n; j++){
					for(int k = j + 1; k <= n; k++){
						if(i != j && j != k && k != i && i + j + k == x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
			n = scn.nextInt();
			x = scn.nextInt();
			cnt = 0;
		}
	}
}