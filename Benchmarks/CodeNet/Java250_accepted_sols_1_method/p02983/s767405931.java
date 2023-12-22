import java.util.*;

public class Main{
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		long L = sc.nextLong();
		long R = sc.nextLong();
		if(R - L < 2019) {
			L = L % 2019;
			R = R % 2019;
			int min = Integer.MAX_VALUE;
			if(L < R) {
				for(int i = (int)L; i <= R - 1; i++) {
					for(int j = i + 1; j <= R; j++) {
						min = Math.min(min, (i * j) % 2019);
					}
				}
			}
			else {
				for(int i = 0; i <= 2018; i++) {
					if(i <= R || L <= i) {
						for(int j = 0; j <= 2018; j++) {
							if((j <= R || L <= j) && i != j) {
								min = Math.min(min, (i * j) % 2019);
							}
						}
					}
				}
			}
			System.out.println(min);
		}
		else{
			System.out.println(0);
		}
	}
}