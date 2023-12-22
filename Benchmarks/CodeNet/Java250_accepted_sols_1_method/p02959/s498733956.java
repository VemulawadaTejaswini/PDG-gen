import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt();
		long a[] = new long[N+1];
		for(int i=0;i<N+1;i++) a[i]=scanner.nextInt();
		long b[] = new long[N];
		for(int i=0;i<N;i++) b[i]=scanner.nextInt();

		long defeated=0;



		for(int i=0;i<N;i++) {
			long tmp1 = b[i];
			long tmp2 = a[i];
			b[i]-= a[i];
			a[i]-= tmp1;
			if(b[i] >= 0) {
				defeated += tmp2;
				long tmp3=b[i];
				long tmp4=a[i+1];
				b[i] -= a[i+1];
				if(b[i] >= 0) {
					defeated += tmp4;
					a[i+1]=0;

				}else {
					a[i+1] -= tmp3;
					defeated += tmp3;
				}

			}else defeated +=tmp1;

//			System.out.println("defeated[" + i + "]=" + defeated);
		}

		System.out.println(defeated);

		scanner.close();
	}
}
