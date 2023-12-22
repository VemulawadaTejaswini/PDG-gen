import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int X = stdIn.nextInt();
		int T = stdIn.nextInt();
		int sum = 0;
		int ans = 0;
		ans = N / X;
		sum = N % X;
		if(sum == 0){
			System.out.println(T * ans);
		}
		else{
			ans = ans + 1;
			System.out.println(T * ans);
		}
		stdIn.close();
	}
}
