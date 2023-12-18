import java.util.Scanner;


public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = sc.nextLong();
		for(int i = 1; i < n; i++){
			ans *= sc.nextLong();
			
			if(18 == String.valueOf(ans).length() && Math.pow(10, 18) < ans) {
				ans = -1;
				break;
			}
			
			if(19 < String.valueOf(ans).length()) {
				ans = -1;
				break;
			}
		}
		System.out.println(ans);
		
		sc.close();
	}

}