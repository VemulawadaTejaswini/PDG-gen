import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		long sum=0;
		
		int[] c = new int[2001];
		for(int i=0;i<=1000;i++) {
			for(int j=0;j<=1000;j++) {
				c[i+j]++;
			}
		}
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			
			for(int k=0;k<=n;k++) {
				if(0<=k && k<=2000 && 0<=n-k && n-k<=2000) {
					sum+=c[k]*c[n-k];
				}
			}
			System.out.printf("%d\n",sum);
			sum=0;
		}
	}
}

