import java.util.*;

class Main{
	Scanner scan=new Scanner(System.in);
	int [][] a;
	int r;
	int c;
	int i;
	int j;
	public Main(){
		r=scan.nextInt();
		c=scan.nextInt();
		a=new int[r+1][c+1];
		for(i=0;i<r;i++){
			for(j=0;j<c;j++){
				a[i][j]=scan.nextInt();
				a[i][c]=a[i][c]+a[i][j];
			}
		}
		for(j=0;j<=c;j++){
			for(i=0;i<r;i++){
				a[r][j]=a[r][j]+a[i][j];
			}
	//		System.out.print(a[r][j]+" ");
		}
		for(i=0;i<=r;i++){
			for(j=0;j<=c;j++){
				if(j==c){
					System.out.println(a[i][c]);
				}else{
					System.out.print(a[i][j]+" ");
				}
					
			}
		}
	}
	public static void main(String[] args){
		new Main();
	}
}