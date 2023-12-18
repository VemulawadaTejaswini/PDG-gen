import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] array = new long[n];
		for(int i = 0;i<n;i++) {
			array[i] = sc.nextLong();
		}
		sc.close();

		long ans = 0L;
		for(int i=0;i<n;i++) {
			long a = array[i];
			for(int j=i+1;j<n;j++) {
				long b = array[j];
				for(int k=j+1;k<n;k++) {
					long c = array[k];
					long max;
					long min;
					long mid;
					if(a>=b) {
						max = a;
						min = b;
						if(max>=c) {
							mid = c;
						} else {
							mid = max;
							max = c;
						}
					}else {
						max = b;
						min = a;
						if(max>=c) {
							mid = c;
						} else {
							mid = max;
							max = c;
						}
					}
					long sa = min - mid;
					if(sa<0) {
						sa = -1L*sa;
					}

					if(min+mid>max&&sa<max&&(a!=b&&a!=c&&b!=c)) {
						ans++;
					}

				}

			}

		}
		System.out.println(ans);

	}
}