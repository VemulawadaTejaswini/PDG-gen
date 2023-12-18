import java.awt.*;
import java.util.*;
import java.io.*;

public class Main{
	static int[] blu = new int[500];
	static int[] red = new int[500];
	static int[][] g = new int[500][500];
	static int[] mb = new int[500];
	static int[] mr = new int[500];
	static int m,n;
	
	public static int chk(int i,int j){
		int a = Math.max(blu[i], red[j]);
		int b = Math.min(blu[i], red[j]);
		while(b!=0){
			int tmp=b;
			b= a%b;
			a= tmp;
		}
//		System.out.printf("%d %d -> %d", blu[i],red[j],a);
//		System.out.println();
		if(a!=1) return 1;
		else return 0;
	}
	
	public static int rb(int i,int j){
		mr[j]=-2;
		do{
			if(g[i][j]==1){
				if(mb[i]==-1 || rb(i+1,mb[i])==1){
					mb[i]=j;
					mr[j]=i;
					return 1;
				}
			}
			i++;
		}while(i<m);
		mr[j]=-1;
		return 0;
	}
	public static int br(int i,int j){
		mb[i]=-2;
		do{
			if(g[i][j]==1){
				if(mr[j]==-1 || br(mr[j],j+1)==1){
					mr[j]=i;
					mb[i]=j;
					return 1;
				}
			}
			j++;
		}while(j<n);
		mb[i]=-1;
		return 0;
	}
	
	public static void main(String args[]) throws Exception{
		int ans;
        Scanner cin= new Scanner(System.in);
		for(;;){
			ans=0;
			m= cin.nextInt();
			n= cin.nextInt();
			if(m==0 && n==0) break;
			for(int i=0;i<m;i++){
				blu[i] = cin.nextInt();
				mb[i] = -1;
			}
			for(int i=0;i<n;i++){
				red[i] = cin.nextInt();
				mr[i] = -1;
			}
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					g[i][j] = chk(i,j);
				}
			}
			for(int i=0;i<n;i++){
				if(mr[i]==-1) ans += rb(0,i);
			}
			System.out.println(ans);
			
		}
	}
}