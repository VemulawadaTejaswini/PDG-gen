
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long x = Long.parseLong(sc.next());
		
		long temp = 100;
		int cnt = 1;
		
		while(true) {
			
			long p = (long) ((long)temp * 0.01);
			temp = p +temp;
			if(temp >= x) {
				System.out.println(cnt);
				return;
			}
			cnt++;
		}

	}

}
