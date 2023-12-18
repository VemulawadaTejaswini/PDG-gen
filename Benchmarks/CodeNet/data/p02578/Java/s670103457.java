import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int[] A = new int[N];
		int a = 0;
		
		for(int i=0; i<N; i++) {
			A[i] = in.nextInt();
		}
		
		for(int i=0; i<N; i++) {
			if(!(i == 0)){
				while(!(A[i-1] == A[i]) && A[i-1] > A[i]) {
					A[i]++;
					a++;
				}
			}
		}
		
		System.out.println(a);
	}
}
