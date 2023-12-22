import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		long[] a = new long[n];

		for (int i=0; i<n;i++){
			a[i] = sc.nextLong();
		}
		
		long m = 0;
		for(int i=0; i<n;i++){
			for(int j=i+1;j<n;j++){
				long ab = a[i]-a[j];
				if ( ab < 0 ) ab*=(-1);
			
				if ( ab>m ) m = ab;
			}
		}
		
		System.out.println(m);
		
	}

}
