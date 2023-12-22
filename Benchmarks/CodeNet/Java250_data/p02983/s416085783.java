import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		int minmod = 2020;
		loop: for(long i = L; i < R; i++) {
			for(long j = i + 1; j <= R; j++) {
				minmod = (int) Math.min(minmod, (i % 2019) * (j % 2019) % 2019);
				if(minmod % 2019 == 0) {
					break loop;
				}
			}
		}
		System.out.println(minmod);
	}

}