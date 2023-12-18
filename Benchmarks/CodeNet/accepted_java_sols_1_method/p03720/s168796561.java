import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int k =sc.nextInt();
		int[] cities =new int[n];
		for (int i=0;i<k;i++) {
			int a =sc.nextInt();
			int b =sc.nextInt();
			for (int j=1;j<=n;j++) {
				if (j==a||j==b) {
					cities[j-1] ++;
				}
			}
		}
		for(int l=0;l<n;l++) {
			System.out.println(cities[l]);
		}
		
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
	}
}