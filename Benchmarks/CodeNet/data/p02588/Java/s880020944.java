import java.util.Scanner;
 
public class Main {
 
	static int ans;
 
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long m = 1000000000 * 1000000000;
		ans = 0;
		double[] a = new double[n];
		for(int i =0; i<n;i++) {
			a[i] = sc.nextDouble();
			double tmp = a[i] * 10000;
			if (!(tmp == Math.floor(tmp)) && !Double.isInfinite(tmp)) {
				a[i] = -1;
//			    System.out.println(variable);
			}
//			System.out.println(a[i]);
		}
		for(int i = 0; i < (a.length-1);i++) {
			if(a[i] == -1) {
				continue;
			}
			for(int j = i+1; j < a.length;j++) {
				if(a[j] == -1) {
					continue;
				}
				double variable = a[i] * a[j];
				if ((variable == Math.floor(variable)) && !Double.isInfinite(variable)) {
				    ans++;
//				    System.out.println(variable);
				}
			}
		}
		
		
		
		System.out.println(ans);
			
	}
	
}