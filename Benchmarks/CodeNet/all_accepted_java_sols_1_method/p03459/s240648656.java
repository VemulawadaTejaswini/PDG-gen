import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] t=new int [n];
		int[] x=new int [n];
		int[] y=new int [n];
		int[] d=new int [n];

		for(int i=0;i<n;i++) {
			t[i]=sc.nextInt();
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
		}
		d[0]=x[0]+y[0];
		if(t[0]<d[0]||(t[0]+d[0])%2==1) {
			System.out.println("No");
			return;
		}
		for(int i=n-1;i>=1;i--) {
			t[i]-=t[i-1];
			d[i]=Math.abs(x[i]-x[i-1])+
					Math.abs(y[i]-y[i-1]);
			if(t[i]<d[i]||(t[i]+d[i])%2==1) {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
		return;



		}
	}
