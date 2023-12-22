import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int ans = 0;
		ans = N * A;
		if(ans <= B){
			System.out.println(ans);
		}
		else{
			System.out.println(B);
		}
		stdIn.close();
	}
}