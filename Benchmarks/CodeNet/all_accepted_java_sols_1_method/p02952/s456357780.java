import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int ans = 0;
		int num = 0;
		while(N/(int)Math.pow(10, num) > 0) {
			num++;
		}

		for(int i = 0;i < num-1;i+=2) {
			ans += 9 * Math.pow(10,i);
		}
		if(num%2 == 1) {
			ans += N - Math.pow(10, num-1) + 1;
		}
		System.out.println(ans);
	}

}
