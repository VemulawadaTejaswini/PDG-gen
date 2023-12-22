import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int a[][]=new int[101][101];
		int i,j;
		
		int r=scan.nextInt(); int c=scan.nextInt();
		
		//初期化
		for(i=0;i<=r;i++){
			for(j=0;j<=c;j++){
				a[i][j]=0;
			}
		}
		
		//読み込みと計算
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				a[i][j]=scan.nextInt();
				a[i][c]+=a[i][j];
				a[r][j]+=a[i][j];
			}
			a[r][c]+=a[i][c];
		}
		
		//表示
		for(i=0;i<=r;i++){
			for(j=0;j<c;j++){
				System.out.printf("%d ",a[i][j]);
			}
			System.out.println(a[i][c]);
		}
		
	}
}
