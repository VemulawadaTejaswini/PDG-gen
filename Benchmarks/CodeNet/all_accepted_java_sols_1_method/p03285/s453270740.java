import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		boolean ans = false;
		for(int i = 0; i <= N/7; i++) {
			if((N-7*i)%4 == 0) {
				ans = true;
			}
		}
		if(ans) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}

	}

}