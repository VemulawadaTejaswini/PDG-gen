import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int M = input.nextInt();
		int[] a = new int[N];
		double sum =0;
		int p=0;
		
		for(int i=0;i<N;i++) {
			a[i]=input.nextInt();
			sum+=a[i];
		}
		for (int i = 0;i<N;i++ ) {
			if ((double)(sum/(4*M))<=a[i]) {
				p++;
			}
		}

		if (p>=M) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}

	}
}
