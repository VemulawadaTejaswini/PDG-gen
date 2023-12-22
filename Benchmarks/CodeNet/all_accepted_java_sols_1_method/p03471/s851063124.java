import java.util.*;

public class Main {

	public static void main(String[] args) {
		int total;
		int sen = -1, gosen = -1, man = -1;
		boolean judge = false;

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Y = sc.nextInt();

		for(int i = 0; i <= N; i++) {
			for(int j = 0; i+j <= N; j++) {
				total = i*1000 + j*5000 + (N-i-j)*10000;
				if(total == Y) {
					judge = true;
					sen = i;
					gosen = j;
					man = N-i-j;
				}
			if(judge) break;
			}
		if(judge) break;
		}
	System.out.println(man + " " + gosen + " " + sen);
	sc.close();
	}

}