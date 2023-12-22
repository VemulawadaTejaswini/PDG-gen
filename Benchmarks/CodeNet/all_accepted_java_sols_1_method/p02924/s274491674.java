import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			long N = scan.nextLong();
			
			/*int []M =new int[N];
			long goukei = 0;
			M[0] = 1;
			goukei+=M[0];
			for(int i = 1;i<N;i++) {
				M[i] = (i+1)%i;
				goukei+=M[i];
				System.out.println(M[i]);
			}*/
			
			System.out.println((N*(N-1))/2);
			
		}	
	}
}
