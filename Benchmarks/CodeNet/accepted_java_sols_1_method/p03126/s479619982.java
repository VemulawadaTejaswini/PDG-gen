import java.util.Scanner;
class Main{
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c[]=new int[b];
		for(int i=0;i<a;i++) {
			int d=sc.nextInt();
			for(int j=0;j<d;j++) {
				int e=sc.nextInt();
				c[e-1]++;
			}
		}
		int ans=0;
		for(int i=0;i<b;i++) {
			if(c[i]==a) {
				ans++;
			}
		}
		System.out.println(ans);
	}
}