import java.awt.Point;
import java.util.Arrays;
import java.util.Scanner;


public class Main{
    Scanner sc=new Scanner(System.in);
    static int h;
    static int w;
    static int mandatory;
    static int[][][][] sumArr;
    static int [][]arr;
    static int[][][][] Divdone;
    static int[][][][] Remdone;
	
	private void cal(){
		
		while(true){
		h=sc.nextInt();
		w=sc.nextInt();
		
		int reserve=sc.nextInt();
		
		if(h==0)
			break;
		
		arr=new int[h][w];
		
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				arr[i][j]=sc.nextInt();
		
		sumArr=new int[h][w][h][w];
		Divdone=new int[h][w][h][w];
		Remdone=new int[h][w][h][w];
		
	       for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				for(int k=0;k<h;k++)
				    for(int p=0;p<w;p++){
					    sumArr[i][j][k][p]=-1;
					    Divdone[i][j][k][p]=-1;
					    Remdone[i][j][k][p]=-1;
				    }

		
		for(int i=0;i<h;i++)
			for(int j=0;j<w;j++)
				for(int k=0;k<h;k++)
					for(int p=0;p<w;p++){
						int temp=0;
						if(i<=k && j<=p)
							for(int z=i;z<=k;z++)
								for(int x=j;x<=p;x++)
									temp+=arr[z][x];
						sumArr[i][j][k][p]=temp;
						
					}
		
		mandatory=sumArr[0][0][h-1][w-1]-reserve;
		
		Point tmp=cut(0,0,h-1,w-1);
		System.out.println(tmp.x+" "+tmp.y);
		
		

		}
		
	}


	public Point cut(int a,int b,int c, int d){
		int maxDiv=1;
		int rem=0;
		if(Divdone[a][b][c][d]==-1 && Remdone[a][b][c][d]==-1){
		for(int i=a;i<c;i++){
			if(sumArr[a][b][i][d]>=mandatory && sumArr[i+1][b][c][d]>=mandatory){
				if(Divdone[a][b][i][d]==-1 && Remdone[a][b][i][d]==-1){
					Point temp1=cut(a,b,i,d);
					Divdone[a][b][i][d]=temp1.x;
					Remdone[a][b][i][d]=temp1.y;
				}
				if(Divdone[i+1][b][c][d]==-1 && Remdone[i+1][b][c][d]==-1){
					Point temp2=cut(i+1,b,c,d);
					Divdone[i+1][b][c][d]=temp2.x;
					Remdone[i+1][b][c][d]=temp2.y;
				}				
				if(Divdone[a][b][i][d]+Divdone[i+1][b][c][d]>maxDiv){
					maxDiv=Divdone[a][b][i][d]+Divdone[i+1][b][c][d];
					rem=Math.min(Remdone[a][b][i][d],Remdone[i+1][b][c][d]);
					}
				if(Divdone[a][b][i][d]+Divdone[i+1][b][c][d]==maxDiv && 
				   Math.min(Remdone[a][b][i][d],Remdone[i+1][b][c][d])>rem){
						rem=Math.min(Remdone[a][b][c][i],Remdone[a][i+1][c][d]);
				}
			}
		}
		
			for(int i=b;i<d;i++)
			if(sumArr[a][b][c][i]>=mandatory && sumArr[a][i+1][c][d]>=mandatory){
				if(Divdone[a][b][c][i]==-1 && Remdone[a][b][c][i]==-1){
					Point temp1=cut(a,b,c,i);
					Divdone[a][b][c][i]=temp1.x;
					Remdone[a][b][c][i]=temp1.y;
					}
				if(Divdone[a][i+1][c][d]==-1 && Remdone[a][i+1][c][d]==-1){
					Point temp2=cut(a,i+1,c,d);
					Divdone[a][i+1][c][d]=temp2.x;
					Remdone[a][i+1][c][d]=temp2.y;
				}			
				if(Divdone[a][b][c][i]+Divdone[a][i+1][c][d]>maxDiv){
					maxDiv=Divdone[a][b][c][i]+Divdone[a][i+1][c][d];
					rem=Math.min(Remdone[a][b][c][i],Remdone[a][i+1][c][d]);
					}
				if(Divdone[a][b][c][i]+Divdone[a][i+1][c][d]==maxDiv && 
				   Math.min(Remdone[a][b][c][i],Remdone[a][i+1][c][d])>rem){
				    rem=Math.min(Remdone[a][b][c][i],Remdone[a][i+1][c][d]);
				}
			}
		
			
			return maxDiv==1? new Point(1,sumArr[a][b][c][d]-mandatory):new Point(maxDiv,rem);}
			else
			    return new Point(Divdone[a][b][c][d],Remdone[a][b][c][d]);
			
			
		
	}
	
	public static void main(String[] argv){
		new Main().cal();
	}
	
	
	
}