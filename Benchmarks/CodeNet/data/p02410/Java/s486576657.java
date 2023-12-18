import java.util.Scanner;

public class Main{

	static Scanner s=new Scanner(System.in);

	public static void main(String __[]){
		input();
		solve();
	}

	static int n,m,a[][],b[],c[];
	private static void input(){
		n=s.nextInt();
		m=s.nextInt();
		a=new int[n][m];
		b=new int[m];
		c=new int[n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=s.nextInt();
			}
		}
			for(int j=0;j<m;j++) {
				b[j]=s.nextInt();
			}
	}
	private static void solve(){
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				c[i]+=a[i][j]*b[j];
			}
			System.out.println(c[i]);
		}
	}
}