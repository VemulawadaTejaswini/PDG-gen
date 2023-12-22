import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long x = scan.nextLong();
		long a = 100;
		int count = 0;
		boolean b = true;
		
		while(b) {
			a += a / 100;
			count++;
			if(a >= x) {
				b = false;
			}
		}
		System.out.println(count);

	}

}
