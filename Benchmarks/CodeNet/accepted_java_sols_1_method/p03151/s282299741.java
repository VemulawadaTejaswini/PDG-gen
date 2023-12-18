import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			int[]A = new int[N];
			int[]B = new int[N];
			int[]C = new int[N];


			int count = 0;
			long goA = 0;
			long goB = 0;

			long hu = 0;
			int huco =0;
			for(int i = 0;i<N;i++)A[i] = scan.nextInt();
			for(int i = 0;i<N;i++)B[i] = scan.nextInt();

			for(int i = 0;i<N;i++) {

				C[i] = A[i]-B[i];
				if(C[i]<0) {
					hu+=(long)C[i];
					huco++;
				}
				goA+=(long)A[i];
				goB+=(long)B[i];
				if(A[i]<B[i])count++;
			}

			if(goA<goB) {
				System.out.println(-1);
				return;
			}


			if(count ==0) {
				System.out.println(0);
				return;
			}

			int co = 0;
			//System.out.println(huco);
			Arrays.sort(C);
			for(int i = N-1;i>=0;i--) {
				if(C[i]>0) {
					hu+=C[i];
					huco++;
					if(hu>=0) {
						break;
					}
				}
			}

			System.out.println(huco);











		}


	}


}
