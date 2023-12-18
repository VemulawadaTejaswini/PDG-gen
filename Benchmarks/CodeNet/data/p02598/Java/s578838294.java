import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long  K = sc.nextLong();
		int A[] = new int[N];
		for (int i=0;i<N;i++) {
			A[i] = sc.nextInt();
		}
		long sum =0;
		for (int i=0;i<N;i++) {
			sum +=A[i];
		}
		double min =1;
		double max = sum/(K+1);
		double mid= 0;
		for (int i=0;i<400;i++) {
			mid = (min+max)/2;
			long num =0;
			for (int j=0;j<N;j++) {
				num +=(int)A[j]/mid;
			}
			if (num <K+1) {
				max =mid;
			} else {
				min = mid;
			}
		}
		System.out.println((long)(Math.ceil(mid)));
	}
}
