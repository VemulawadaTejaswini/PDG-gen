import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();
		
		double[] e = new double[n];
		for(int i=0;i<n;i++) {
			int p = sc.nextInt();
			e[i] = (1+p)/2.0;
		}
		
		double sum = 0;
		for(int i=0;i<k;i++) {
			sum+=e[i];
		}
		
		int l = 0, r = k;
		double max = sum;
		while(r<n) {
			sum -= e[l++];
			sum += e[r++];
			if(sum > max)
				max = sum;
		}
		
		System.out.printf("%.12f\n", max);
	}

}
