import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
 		int n = scan.nextInt();
		String S = scan.next();
		int a[] = new int[n];
		int x[] = new int[n];
		int y[] = new int[n];

		for(int i=0;i<n;i++) {
			a[i] = S.substring(i, i+1).equals("E") ? 0:1;
		}

		x[0] = a[0];
		y[n-1] = a[n-1] == 0 ? 1:0;

		for(int i=1;i<n;i++){
			x[i] = x[i-1] + a[i];
		}

		for(int i=n-2;i>=0;i--){
			y[i] = y[i+1] + (a[i]-1)*-1;
		}

		int min = Integer.MAX_VALUE;
		for(int i=1;i<n-1;i++){
			int minj = x[i-1] + y[i+1];

			min = Math.min(minj,min);
		}
		min = Math.min(x[n-2],min);
		min = Math.min(y[1],min);

		System.out.println(min);
	}
 
}