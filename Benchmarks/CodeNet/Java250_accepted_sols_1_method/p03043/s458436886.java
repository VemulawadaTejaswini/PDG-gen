import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long k = sc.nextLong();
		long count = 0;
		double  sum = 0;


		for(int i=1;i<=Math.min(n,k);i++) {
			for(int j=i;j<k;j*=2) {
				count++;
			}
			sum+=1.0/n * 1.0/Math.pow(2, count);
			count=0;
		}
		for(int i=0;i<n-k;i++) {
			sum+=1.0/n;
		}
		System.out.println(sum);
	}
}


