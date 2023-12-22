import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int ans = 0;
		for(int i = 1; i < N + 1; i++){
			if(i < 10){
				ans++;
			}
			if(100 <= i && i < 1000){
				ans++;
			}
			if(10000 <= i && i < 100000){
				ans++;
			}
		}
		System.out.println(ans);
		stdIn.close();
	}
}
