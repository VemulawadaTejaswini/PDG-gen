import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		long X = scn.nextLong();
		long ans = 0;
		while(true) {
			ans++;
			if(ans * (ans + 1)/2 >= X)break;
		}
		System.out.println(ans);
	}

}
