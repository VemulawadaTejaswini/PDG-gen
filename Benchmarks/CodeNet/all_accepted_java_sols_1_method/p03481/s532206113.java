import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		long x = stdIn.nextLong();
		long y = stdIn.nextLong();
		
		long a = x;
		long cnt = 0;
		while(a <= y) {
			cnt++;
			a*=2;
		}
		
		System.out.println(cnt);
		
		
	}

}
