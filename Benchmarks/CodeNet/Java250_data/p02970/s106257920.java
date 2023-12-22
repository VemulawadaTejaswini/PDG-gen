import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int d = scan.nextInt();
		int can = 2*d+1;
		int ans = 0;
		if(n%can == 0) {
			ans = n/can;
		}else {
			ans = n/can+1;
		}
		System.out.println(ans);
	}

}



