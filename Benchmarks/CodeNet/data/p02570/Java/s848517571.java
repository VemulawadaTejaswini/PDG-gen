
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Long hako[] = new Long[n];
		double hokan = 0;
		double sum=0;
		int mod = 1000000007;

		for(int i=0;i<n;i++) {
			hako[i]=sc.nextLong();
		}

		for(int i=0;i<n-1;i++) {
			hokan += hako[i];
			sum += hokan*hako[i+1];
			sum %= mod;
			hokan %= mod;
		}
		System.out.println((int)sum);
	}
}


