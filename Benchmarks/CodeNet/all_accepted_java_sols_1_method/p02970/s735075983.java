
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);


		int N = sc.nextInt();
		int D = sc.nextInt();
		int ans;


		if(N/2 <= D) {
			ans = 1;
		}else if(N%(2*D+1) == 0){
			ans = N/(2*D+1);
		}else {
			ans = N/(2*D+1) + 1;
		}

		System.out.println(ans);
	}

}