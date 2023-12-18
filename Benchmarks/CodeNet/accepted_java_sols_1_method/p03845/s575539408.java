import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int c[]=new int[a];
		for(int i=0;i!=a;i++) {
			c[i]=scan.nextInt();
		}
		int b=scan.nextInt();
		int ans[]=new int[b];
		for(int i=0;i!=b;i++) {
			int e=scan.nextInt();
			int f=scan.nextInt();
			for(int j=0;j!=a;j++) {
				if(j+1==e) {
					ans[i]+=f;
					continue;
				}
				ans[i]+=c[j];
			}
		}
		for(int i=0;i!=b;i++) {
			System.out.println(ans[i]);
		}
	}
}