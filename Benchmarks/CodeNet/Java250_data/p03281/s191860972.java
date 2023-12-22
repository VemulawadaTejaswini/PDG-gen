import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//B
		int N = sc.nextInt();
		int ans = 0;
		for(int i = 8 ; i <= N ; i++){
			if(i % 2 == 1 && yaku(i) == 8){
				ans++;
			}
		}
		System.out.println(ans);
	}

	public static  int yaku(int N){
		int yaku = 0;
		for(int i = 1 ; i <= N; i++){
			if(N % i == 0){
				yaku++;
			}
		}
		return yaku;
	}
}
