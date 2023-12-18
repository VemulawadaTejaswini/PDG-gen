import java.util.Scanner;

public class Main{

	public static void main (String [] args) {

		Scanner sc = new Scanner (System.in);

		int N = sc.nextInt();
		int nowCount = 0;
		int maximum = 0;
		int nowPlace = sc.nextInt();

		for (int index=1; index<N; index++) {
			int nextPlace = sc.nextInt();
			if (nowPlace>=nextPlace) {
				nowCount++;
			} else {
				if (nowCount>maximum) {
					maximum=nowCount;
				}
				nowCount = 0;
			}
			nowPlace = nextPlace;
		}
		if (nowCount>maximum) {
			maximum=nowCount;
		}

		System.out.println(maximum);
	}
}