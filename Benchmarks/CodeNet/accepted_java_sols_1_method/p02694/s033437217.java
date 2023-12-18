import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();

		long deposit = 100;
		long cnt = 0;
		
		for(;;) {
			cnt++;
			deposit = (long)Math.floor(deposit * 1.01);
			if(deposit >= X) {
				System.out.println(cnt);
				return;
			}
		}

	}

}
