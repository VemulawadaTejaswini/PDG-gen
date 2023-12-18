import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int w[] = new int[n];
		for(int i=0; i<n; i++) {
			w[i] = sc.nextInt();
		}
		int min = 1000000000;
		for(int i=0; i<n; i++) {
			int s1 = 0;
			int s2 = 0;
			for(int j = 0; j<=i; j++) {
				s1 += w[j];
			}
			for(int k = i+1; k<=n-1; k++) {
				s2 += w[k];
			}
			int minTemp = Math.abs(s1 - s2);
			if(minTemp < min) {
				min = minTemp;
			}
		}

		System.out.println(min);
	}
}