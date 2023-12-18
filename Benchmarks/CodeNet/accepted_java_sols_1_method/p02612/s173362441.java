import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		
		int ans = n % 1000;
		
		if(ans == 0) {
			ans = 0;
		}else {
			ans = 1000 - ans;
		}
		System.out.println(ans);
	}

}
