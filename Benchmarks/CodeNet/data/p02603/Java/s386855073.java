import java.util.Scanner;

public class Main{
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){

			int N = scan.nextInt();

			long []A = new long[N];

			for(int i = 0;i<N;i++)A[i] = scan.nextLong();

			/*
			int count = 0;
			for(int i = 0;i<N-1;i++) {
				int max = A[i];
				for(int j = i+1;j<N;j++) {
					max = Math.max(A[j], max);
				}

				if(max==A[i])count++;
			}

			if(count==N-1) {
				System.out.println(N);
				return;
			}*/

			long goukei = 1000;

			long motteru = 0;

			for(int i = 0;i<N-1;i++) {


				if(motteru==0) {
					if(A[i]<A[i+1]) {
						motteru=goukei/A[i];
						goukei-=motteru*A[i];
					}
				}else {
					if(A[i]>A[i+1]) {
						goukei+=motteru*A[i];
						motteru=0;
					}
				}

				if(i==N-2) {
					if(motteru==0)continue;
					else {
						goukei+=motteru*A[i+1];
						continue;
					}
				}






			}

			System.out.println(goukei);




		}


	}



}
