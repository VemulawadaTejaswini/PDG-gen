import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int[] b = new int[N-1];
		int sum = 0;

		for(int i = 0; i<N-1;i++) {
			b[i] = sc.nextInt();
		}
		
		for(int i = 0;i<N-1;i++) {
			a[i] = b[i];
			a[i+1]=b[i];
			

		}
		for(int i = 0;i<N-2;i++) {

			if(b[i+1] > b[i] ) {
				a[i+1] = b[i];
			}
				

		}
		
		for(int i=0;i<N;i++) {
			sum += a[i];
		}
		

		System.out.println(sum);

		sc.close();
	}
}

