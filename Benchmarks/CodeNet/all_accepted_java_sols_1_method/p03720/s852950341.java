import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();

		int[] ab = new int[2*M];
		int[] cities = new int[N];
		for(int i=0; i<2*M; i++) {
			ab[i] = sc.nextInt();

			for(int j=0; j<N; j++) {
				if(ab[i]-1 == j ) {
					cities[j] += 1;
				}
			}
		}

		for(int k=0; k<N; k++) {
			System.out.println(cities[k]);
		}




	}

}
