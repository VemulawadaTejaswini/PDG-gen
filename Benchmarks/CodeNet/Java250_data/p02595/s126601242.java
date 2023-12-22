import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int N = scan.nextInt();
			int d = scan.nextInt();
			double D = (double)d;
			
			long[]X = new long[N];
			long[]Y = new long[N];
			for(int i = 0;i<N;i++) {
				X[i] = scan.nextLong();
				Y[i] = scan.nextLong();
			}
			
			int count = 0;
			
			for(int i = 0;i<N;i++) {
				double dist = Math.sqrt(X[i]*X[i]+Y[i]*Y[i]);
				if(D>=dist)count++;
			}
			
			System.out.println(count);
			
			
		}
		
		
	}
		

}
