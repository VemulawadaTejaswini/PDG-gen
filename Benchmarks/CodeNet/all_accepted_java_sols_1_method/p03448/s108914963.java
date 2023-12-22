import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int coin500 = sc.nextInt();
		int coin100 = sc.nextInt();
		int coin50 = sc.nextInt();
		int x = sc.nextInt();
		int ans = 0;
		for(int i = 0; i <= coin500; ++i){
			for(int j = 0; j <= coin100; ++j){
				for(int k = 0; k <= coin50; ++k){
					int tmp = i * 500 + j * 100 + k * 50;
					if(tmp == x) ans++;
				}
			}
		}
		System.out.println(ans);
	}
}