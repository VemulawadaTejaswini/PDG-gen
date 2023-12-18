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

			long sum = A[0];
			int stock = 2;
			int s = 1;
			long max = A[s];


			if(N==2) {
				System.out.println(A[0]);
				return;
			}

			for(int i = 2;i<N;i++) {
				sum+=max;
				stock--;
				if(stock==0) {
					stock = 2;
					s++;
					max = A[s];
				}
			}

			System.out.println(sum);



		}


	}


}
