import java.util.Scanner;
import java.util.regex.*;
import java.math.*;

public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		//int a = sc.nextInt();
		// スペース区切りの整数の入力
		//int b = sc.nextInt();
		//int c = sc.nextInt();
		// 文字列の入力
		//String s = sc.next();
		//1文字ずつ
		//s.atChar(i);
		// 出力
		//System.out.println("");
		//double countx=0;

		int H=sc.nextInt();
		int W=sc.nextInt();
	
		int[][] a=new int[H][W];
		
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int co=0;
		int[] x=new int[H*W];
		int[] xd=new int[H*W];
		int[] y=new int[H*W];
		int[] yd=new int[H*W];

	
		int k=0;
		int wpoint=0;
		int wend=0;
		if(H%2!=0){
			wend=W-1;
		}
		while(k<H){
			//System.out.println("wp:"+wpoint);
			if(k==H-1 && wpoint ==wend){
				break;
			}
			if(k%2==0){
				
				if(wpoint==W-1){
					if(a[k][W-1]%2==1){
						
						y[co]=k+1;
						yd[co]=k+2;
						x[co]=wpoint+1;
						xd[co]=wpoint+1;
						co++;
						a[k][W-1]--;
						a[k+1][W-1]++;
						
						
					}
					k++;
				}else{
				
					if(a[k][wpoint]%2==1){
						y[co]=k+1;
						yd[co]=k+1;
						x[co]=wpoint+1;
						xd[co]=wpoint+2;
						co++;
						a[k][wpoint]--;
						a[k][wpoint+1]++;
						
					}
					wpoint++;
					
				}
			}else{
				
				if(wpoint==0){
					if(a[k][0]%2==1){
						y[co]=k+1;
						yd[co]=k+2;
						x[co]=wpoint+1;
						xd[co]=wpoint+1;
						co++;
						a[k][0]--;
						a[k+1][0]++;
						
						
					}
					k++;
				}else{
					
				
					if(a[k][wpoint]%2==1){
						y[co]=k+1;
						yd[co]=k+1;
						x[co]=wpoint+1;
						xd[co]=wpoint;
						co++;	
						a[k][wpoint]--;
						a[k][wpoint-1]++;
						
					
					}
					wpoint--;
					
				}
			}
		}
	
		System.out.println(co);
		for(int i=0;i<co;i++){
			System.out.println(y[i]+" "+x[i]+" "+yd[i]+" "+xd[i]);
		}
		
		
	}
}