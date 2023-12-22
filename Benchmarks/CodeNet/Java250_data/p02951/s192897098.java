import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int C = stdIn.nextInt();
		int ans = 0;
		ans = A - B;
		if(ans <= C){
			System.out.println(C - ans);
		}
		else{
			System.out.println(0);
		}
		stdIn.close();
	}
}
