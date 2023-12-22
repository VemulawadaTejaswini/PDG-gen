import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int b,f,r,v,m,i,j,k;
		int [][][] d = new int[4][3][10];
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++)
				d[i][j][k]=0;
			}
		}
		Scanner sc = new Scanner(System.in);
		m=sc.nextInt();
		for(i=0;i<m;i++){
			b=sc.nextInt();
			f=sc.nextInt();
			r=sc.nextInt();
			v=sc.nextInt();
			d[b-1][f-1][r-1]+=v;
		}
		for(i=0;i<4;i++){
			for(j=0;j<3;j++){
				for(k=0;k<10;k++)
					System.out.print(" "+d[i][j][k]);
				System.out.println();
			}
			if(i<3)
				System.out.println("####################");
		}
	}
}
