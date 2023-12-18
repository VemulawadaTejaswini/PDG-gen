import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int[] a,b;
		Scanner scan = new Scanner(System.in);
		while(true){
			n = scan.nextInt();
			if(n==0)
				break;
			a = new int[n];
			b = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = scan.nextInt();
				b[i] = scan.nextInt();
			}

			int ansA = 0;
			int ansB = 0;

			for (int i=0; i<n; i++) {
				if(a[i]>b[i])
					ansA += a[i]+b[i];
				else if(a[i]<b[i])
					ansB += a[i]+b[i];
				else{
					ansA += a[i];
					ansB += b[i];
				}
			}
			System.out.println(ansA+" "+ansB);

		}
		scan.close();
	}
}