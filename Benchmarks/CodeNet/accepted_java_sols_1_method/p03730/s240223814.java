import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long a = stdIn.nextLong();
		long b = stdIn.nextLong();
		long c = stdIn.nextLong();
		
		for(int i = 0; i < (int)1e8; i++) {
			if((b*i+c)/a == (b*i+c)/(double)a) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
		
	}

}
