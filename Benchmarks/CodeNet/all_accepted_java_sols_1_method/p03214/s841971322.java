
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N=scan.nextInt();
		int[] frame = new  int[N];
		float sumAllFrameNum = 0;

		for(int i=0; i<N; i++) {
			frame[i] = scan.nextInt();
			sumAllFrameNum+= frame[i];
		}
		scan.close();

		float average = sumAllFrameNum / N;

		float minSa = 100;
		int kouho = 0;
		float sa = 0;
		for(int i=0; i<N; i++) {
			if(frame[i]==average) {
				System.out.println(i);
				return;
			} else {
				sa = Math.abs(frame[i] - average);
				if(sa < minSa) {
					minSa = sa;
					kouho = i;
				}

			}
		}
		System.out.println(kouho);
	}

}
