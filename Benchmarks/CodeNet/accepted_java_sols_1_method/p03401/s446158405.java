import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin =new Scanner(System.in);
		int n=stdin.nextInt();
		int a[]=new int[n+2];
		int i,j,k;
		int sum=0;
		int dis;
		a[0]=0;
		a[n+1]=0;
		for(i=1;i<n+1;i++)
			a[i]=stdin.nextInt();

		for(i=1;i<n+2;i++){
			dis=Math.abs(a[i]-a[i-1]);
			sum+=dis;
//			System.out.println("dis="+dis);
		}
//		System.out.println("sum="+sum);
		for(i=1;i<n+1;i++){
			int x=Math.abs(a[i]-a[i-1])+Math.abs(a[i+1]-a[i]);
			int y=Math.abs(a[i+1]-a[i-1]);
			System.out.println(sum+y-x);
		}
	}
}