import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			Long[]A = new Long[N];
			for(int i = 0;i<N;i++)A[i] = scan.nextLong();

			Arrays.sort(A,Collections.reverseOrder());

			long sum = 0;
			int stock = 1;
			long max = A[0];
			long max2 = 0;

			for(int i = 1;i<N;i++) {

				sum+=max;
				stock--;
				max2 = A[i];
				if(stock==0) {
					stock=2;
					max = max2;
				}

			}

			System.out.println(sum);



		}


	}


}
