import java.util.Scanner;

public class Main {
	//java11

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		long X = sc.nextLong();

		long cost = 100;
		int ans = 0;
		for(int i=1; i<4000; i++) {
			cost = (long)(cost*1.01);
			if(cost >= X) {
				ans = i;
				break;
			}
		}

		System.out.println(ans);

	}


}
