import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(),f=0,i,j;
		scan.close();
		for(i=0;i<=n;i++) {
			for(j=0;j<=n;j++) {
				if(4*i+7*j==n) {
					if(f==0) System.out.print("Yes");
					f=1;
				}
			}
		}
		if(f==0) System.out.print("No");
	}
}