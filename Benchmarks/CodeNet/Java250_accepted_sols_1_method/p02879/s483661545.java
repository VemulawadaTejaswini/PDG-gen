import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int A = stdIn.nextInt();
		int B = stdIn.nextInt();
		int ans = 0;

		ans = A * B;
		if(A > 9){
			ans = -1;
		}
		else if(B > 9){
			ans = -1;
		}

		System.out.println(ans);

		stdIn.close();
	}
}