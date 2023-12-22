import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int max = sc.nextInt();

		int min = max;

		for(int i=0;i<N-1;i++) {

			int a = sc.nextInt();

			if(a>max) {

				max = a;
			}
			if(a<min) {

				min = a;
			}
		}

		System.out.println((max-min));
	}

}

