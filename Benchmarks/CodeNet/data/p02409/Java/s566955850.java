import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner stdIn=new Scanner(System.in);
		int n,b,f,r,v,i,j,k;
		int[][][] a=new int[4][3][10];
		n=stdIn.nextInt();
		for(i=0;i<n;i++){
			b=stdIn.nextInt();
			f=stdIn.nextInt();
			r=stdIn.nextInt();
			v=stdIn.nextInt();
			a[b-1][f-1][r-1]+=v;
		}
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++)System.out.print(" "+a[i][j][k]);
				System.out.println();
			}
			if(i!=3)System.out.println("####################");
		}
	}
}
