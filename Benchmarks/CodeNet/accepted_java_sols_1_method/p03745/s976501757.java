import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();
			long[]A = new long[N];
			for(int i = 0;i<N;i++)A[i] = scan.nextLong();


			int nanko = 1;

			if(N==1) {
				System.out.println(1);
				return;
			}

			int mode = 0;



			for(int i = 0;i<N-1;i++) {
				if(mode==0) {
					if(A[i]<A[i+1])mode=1;
					if(A[i]>A[i+1])mode=-1;
				}else if(mode==1) {
					if(A[i]>A[i+1]) {
						nanko++;
						mode = 0;
					}
				}else if(mode==-1) {
					if(A[i]<A[i+1]) {
						nanko++;
						mode = 0;
					}
				}
			}


			System.out.println(nanko);

		}


	}


}
