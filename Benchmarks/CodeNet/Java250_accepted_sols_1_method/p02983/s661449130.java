import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		long L = stdIn.nextInt();
		long R = stdIn.nextInt();
		for(long i = L; i <= R; i++) {
			if(i%673 == 0 && ((R-L+1) >= 3 || i-1 >= L)) {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		long min = 2018;
		for(long i = L; i < R; i++) {
			for(long j = i+1; j <= R; j++) {
				if((i*j)%2019 < min) {
					min = (i*j)%2019;
				}
			}
		}
		
		System.out.println(min);

	}

}