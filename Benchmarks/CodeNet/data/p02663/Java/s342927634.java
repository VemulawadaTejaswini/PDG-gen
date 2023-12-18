package nomura;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int H1 = Integer.parseInt(sc.next());
		int M1 = Integer.parseInt(sc.next());
		int H2 = Integer.parseInt(sc.next());
		int M2 = Integer.parseInt(sc.next());
		int K = Integer.parseInt(sc.next());
		int wakeUp = H1*60+M1;
		int sleep = H2*60+M2;
		int study = sleep-wakeUp-K;

		System.out.println((study)>=0? study: 0);

	}

}
