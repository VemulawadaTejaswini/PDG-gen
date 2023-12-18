import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		for(int i = 0 ; ; i++) {
			x -= i;
			if(x <= 0) {
				System.out.println(i);
				return;
			}
		}
	}
}
