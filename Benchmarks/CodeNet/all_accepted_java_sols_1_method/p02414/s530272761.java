import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt(); int m=scan.nextInt(); int l=scan.nextInt();
		int a[][]=new int [100][100]; int b[][]=new int [100][100]; long c[][]=new long [100][100];
		int i,j,k;
		
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				a[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<m;i++){
			for(j=0;j<l;j++){
				b[i][j]=scan.nextInt();
			}
		}
		
		for(i=0;i<n;i++){
			for(j=0;j<l;j++){
				c[i][j]=0;
				for(k=0;k<m;k++){
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
		for(i=0;i<n;i++){
			for(j=0;j<l-1;j++){
				System.out.printf("%d ",c[i][j]);
			}
			System.out.println(c[i][l-1]);
		}
	}
}
