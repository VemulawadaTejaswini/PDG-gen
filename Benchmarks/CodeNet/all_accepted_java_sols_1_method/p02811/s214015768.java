import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int K = stdIn.nextInt();
		int X = stdIn.nextInt();
		int ans = 0;
		ans = K * 500;
		if(ans >= X){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		stdIn.close();
	}
}