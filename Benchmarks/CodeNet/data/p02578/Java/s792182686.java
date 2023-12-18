
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		for(int i=0; i<N; i++) A[i]=sc.nextInt();



		int old_hight = A[0];
		int sum = 0;

		for(int h : A) {

			if(h >= old_hight) {
				old_hight=h;
			}
			else {
				int s = old_hight - h;
				sum = sum + s;
			}

		}

		System.out.println(sum);

	}
}
