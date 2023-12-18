//package ABC147A;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		//long startTime = System.currentTimeMillis();
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int[][] c=new int[n][n];
		//int[] vector=new int[n];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				c[i][j]=-1;
			}
		}
		
		for(int i=0;i<n;i++){
			int a=sc.nextInt();
			for(int j=0;j<a;j++){
				int x=sc.nextInt();
				int y=sc.nextInt();
				c[i][x-1]=y;
			}
		}
		
		int ans=0;
		
		for (int k=1; k<(1<<n); k++) {
			int tmp=0;
			int bits=k;
			//int bits=Integer.parseInt(Integer.toBinaryString(k));
			
			//System.out.println(bits);
			
			int[]vec=new int[n];
	
			for(int m=0;m<n;m++){
				vec[n-m-1]=0;
				if(((bits>>m)&1)==1){
					vec[n-m-1]=1;
				}
				
				//System.out.println((n-m-1)+" "+vec[n-m-1]);
			}
				

				for(int i=0;i<n;i++){
boolean check=true;
int[] honest =new int [n];

					for(int j=0;j<n;j++){
						if(c[i][j]==-1)continue;
						else if(c[i][j]!=vec[j]){check=false;break;}
					}
					if(check==true&&vec[i]==1){
					   tmp++;
					 }else if(vec[i]==1){
					 tmp=0;
					 break;
					 }
				}
				if(tmp>ans){
				  ans=tmp;
				  //System.out.println("update "+tmp);
				}
				tmp=0;
			}
		
		
		System.out.println(ans);
	}
}



