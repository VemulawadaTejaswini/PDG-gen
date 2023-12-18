import java.util.Arrays;
import java.util.Scanner;				
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc =new Scanner(System.in);
			int N = sc.nextInt();
			int temp = 1000000000;
			int S = sc.nextInt();
			int lol = S-1;
			int[]A = new int[N];
			for(int i =0; i<N; i++) {
				A[i] = sc.nextInt();
			}
			
			Arrays.sort(A);
			for(int i =0; i<A.length; i++) {
			if(A.length - i == lol) {
					break;
				}
				if(A[i+lol]-A[i]<temp) {
				temp = A[i+lol] - A[i];
				}
				
				}
			System.out.println(temp);
	}

}
