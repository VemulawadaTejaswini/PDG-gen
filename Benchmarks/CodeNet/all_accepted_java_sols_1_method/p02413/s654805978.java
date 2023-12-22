import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int r,c,a[][]=new int[101][101],i,j;
		r=stdIn.nextInt();
		c=stdIn.nextInt();
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				a[i][j]=stdIn.nextInt();
				a[i][c]+=a[i][j];
			}
		}
		for(i=0;i<c;i++){
			for(j=0;j<r;j++)a[r][i]+=a[j][i];
			a[r][c]+=a[r][i];
		}
		for(i=0;i<=r;i++){
			for(j=0;j<=c;j++){
				if(j!=0)System.out.print(" ");
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
