import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Integer.parseInt(sc.next());
		int M = Integer.parseInt(sc.next());
		int maxL = 0;
		int minR = 100001;
		for(int i=0; i<M; i++) {
			maxL = Math.max(maxL, Integer.parseInt(sc.next()));
			minR = Math.min(minR, Integer.parseInt(sc.next()));
		}
		sc.close();

		System.out.println(Math.max(0, minR-maxL+1));
	}

}
