import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int [n];
		int b[] = new int [n];
		int c[] = new int [n];
		for(int i=0;i<n;i++){
			a[i] = scan.nextInt();
			b[i] = scan.nextInt();
			c[i] = scan.nextInt();
			a[i]=a[i]*a[i];
			b[i]=b[i]*b[i];
			c[i]=c[i]*c[i];
			if(a[i]==b[i]+c[i])
				System.out.println("YES");
			else if(b[i]==a[i]+c[i])
				System.out.println("YES");
			else if(c[i]==b[i]+a[i])
				System.out.println("YES");
			else System.out.println("NO");
		}
	}
}