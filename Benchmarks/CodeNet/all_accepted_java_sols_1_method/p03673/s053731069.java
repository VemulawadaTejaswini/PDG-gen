import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		int[] b = new int[n];
		if(n%2==0) {
			for(int i=0;i<n/2;i++) {
				b[i] = a[n-1-2*i];
			}
			for(int i=n/2;i<n;i++) {
				b[i] = a[(i-n/2)*2];
			}
		}else {
			for(int i=0;i<=n/2;i++) {
				b[i] = a[n-1-2*i];
			}
			for(int i=n/2+1;i<n;i++) {
				b[i] = a[(i-n/2)*2-1];
			}
		}
		
		for(int i=0;i<n;i++) {
			System.out.print(b[i]+" ");
		}
		in.close();

	}

}
