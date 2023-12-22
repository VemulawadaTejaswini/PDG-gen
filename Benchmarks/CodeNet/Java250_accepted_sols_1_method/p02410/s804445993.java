import java.util.Scanner;
class Main{
    public static void main(String[] args){
		int n,m;
		int[][] a=new int[101][101];
		int[] b=new int[101];
		int[] c=new int[101];
		for(int i=0;i<100;i++)c[i]=0;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				a[i][j]=sc.nextInt();
			}
		}
		for(int j=1;j<=m;j++){
			b[j]=sc.nextInt();
		}
		for(int i=1;i<=n;i++){
			for(int j=1;j<=m;j++){
				c[i]+=(a[i][j]*b[j]);
			}
		}
		for(int i=1;i<=n;i++){
			System.out.println(c[i]);
		}
    }
}

