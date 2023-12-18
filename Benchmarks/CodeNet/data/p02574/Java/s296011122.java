import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		long B[] = new long[2000000];
		for (int i=0;i<N;i++) {
			A[i]= sc.nextInt();
		}
		boolean b = true;
		for (int i=0;i<N&&b;i++) {
			int temp = A[i];
			for (int j=2;j*j<=temp&&b;j++) {
				boolean t= true;
				while (temp%j==0) {
					if (t==true) {
						B[j]++;
						if (B[j]>1) {
							b = false;
							break;
						}
						t = false;
					}
					temp = temp/j;
				}
			}
			B[temp]++;
			if (B[temp]>1) {
				b = false;
				break;
			}
		}
		if (b== true)  {
			System.out.println("pairwise coprime");
			return ;
		}
		int gcd = A[0];
		for (int i=1;i<N;i++) {
			gcd= Main.gcd(gcd, A[i]);
		}
		if (gcd==1) {
			System.out.println("setwise coprime");
			return ;
		}
		System.out.println("not coprime");
		return ;
	}

	public static int gcd (int a,int b) {
		if (a<b) {
			return gcd(b,a);
		}
		if (b==0) {
			return a;
		}
		return gcd (b,a%b);
	}
}