import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long X  = sc.nextLong();
		
		int now = 0;
		
		for(long i = 1; i <= X; i++) {
			now += i;
			if(now >= X) {
				System.out.println(i);
				break;
			}
		}
	}
}
