import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int X = sc.nextInt();

		int m;
		int minM=0;;
		int totalM = 0;

		for (int i=0; i<N; i++){
			m = sc.nextInt();
			if (i == 0){
				minM = m;
			} else {
				minM = Math.min(minM, m);
			}
			totalM += m;
		}
		System.out.println(N + (X-totalM)/minM);
	}

}
