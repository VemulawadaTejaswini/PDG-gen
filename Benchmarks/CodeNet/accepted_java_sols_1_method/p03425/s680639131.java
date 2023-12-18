import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long[] a = new long[5];
		int n = in.nextInt();
		for(int i=0;i<n;i++) {
			String str = in.next();
			char c = str.charAt(0);
			if(c=='M') a[0]++;
			else if(c=='A') a[1]++;
			else if(c=='R') a[2]++;
			else if(c=='C') a[3]++;
			else if(c=='H') a[4]++;
		}
		long sum = 0;
		for(int i=0;i<=2;i++) {
			for(int j=i+1;j<=3;j++) {
				for(int k=j+1;k<=4;k++) {
					sum += a[i]*a[j]*a[k];
				}
			}
		}
		System.out.println(sum);
		in.close();
	}

}
