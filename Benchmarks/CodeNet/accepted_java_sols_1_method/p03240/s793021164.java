import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] x = new int[n];
		int[] y = new int[n];
		int[] h = new int[n];
		
		for(int i=0; i<n; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
			h[i] = sc.nextInt();
		}
		
		
		for(int i=0; i<=100; i++) {
			for(int j=0; j<=100; j++) {
				int H = 0;
				boolean flag = true;
				for(int p=0; p<n; p++) {
					if(h[p]!=0) {
						H = h[p] + Math.abs(i-x[p]) + Math.abs(j-y[p]);
					}
				}
				for(int k=0; k<n; k++) {
					if(h[k] != Math.max(H - Math.abs(i-x[k]) - Math.abs(j-y[k]), 0)) {
						flag = false;
					}
				}
				if(flag) {
					System.out.println(i + " " + j + " " + H);
				}
			}
		}
		
	}
}
