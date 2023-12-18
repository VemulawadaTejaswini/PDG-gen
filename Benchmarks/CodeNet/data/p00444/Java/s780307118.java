
import java.util.Scanner;
public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int m = stdIn.nextInt();
		m = 1000 - m;
		int t = 0;
		while(m != 0) {
			if(m - 500 >= 0) {
				t++;
				m -= 500;
				continue;
			}
			if(m - 100 >= 0) {
				t++;
				m -= 100;
				continue;
			}
			if(m - 50 >= 0) {
				t++;
				m -= 50;
				continue;
			}
			if(m - 10 >= 0) {
				t++;
				m -= 10;
				continue;
			}
			if(m - 5 >= 0) {
				t++;
				m -= 5;
				continue;
			}
			if(m - 1 >= 0) {
				t++;
				m -= 1;
				continue;
			}
		}
		
		System.out.println(t);
		
		
		
	}
}