import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long L = scan.nextLong();
		long R = scan.nextLong();
		
		long min = Long.MAX_VALUE;
		
		if(Math.abs(L - R) >= 2019) {
			System.out.println(0);
			scan.close();
			return;
		}
		
		for(long i = L; i < R; i++) {
			for(long j = i + 1; j <= R; j++) {
				if(min > (i * j) % 2019) {
					min = (i * j) % 2019;
				}
			}
		}
		
		System.out.println(min);
		scan.close();
	}

}