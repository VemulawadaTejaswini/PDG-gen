import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int ans = 0;
		ans = N * N;
		System.out.println(ans);
		stdIn.close();
	}
}
