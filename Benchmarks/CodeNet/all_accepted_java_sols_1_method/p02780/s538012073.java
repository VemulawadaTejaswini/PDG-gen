import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			int n = sc.nextInt();
			int k = sc.nextInt();
			double[] ave = new double[n];
			double[] suma = new double[n];

			for(int i=0;i<n;i++) {
				ave[i]=(sc.nextInt()+1)/2.00;
				if(i==0) {
					suma[i]=ave[i];
				}else {
					suma[i] = suma[i-1]+ave[i];
				}
			}

			double ret = 0.00;

			for(int i=0;i<=n-k;i++) {
				if(i==0) {
					ret = suma[i+k-1];
				}else {
					ret = Math.max(ret, (suma[i+k-1]-suma[i-1]));
				}
			}

			System.out.println(ret);
		}



	}
