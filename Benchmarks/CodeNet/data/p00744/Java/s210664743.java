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
		if(a!=1) return -1;
		else return 0;
	}
	
	public static boolean rb(int i,int j){
		for(int ii=i;ii<m;ii++){
			if(g[ii][j]==-1){
				if(mb[ii]==-1){
					mb[ii]=j;
					mr[j]=ii;
					return true;
				}
			}
		}
		do{
			if(g[i][j]==-1){
				if(mb[i]==-1 || (i+1<m && rb(i+1,mb[i]))){
					mb[i]=j;
					mr[j]=i;
					return true;
				}
				i++;
			}else i+=g[i][j];
		}while(i<m);
		return false;
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
			for(int j=0;j<n;j++){
				int c=1;
				for(int i=m-1;i>=0;i--){
					if(g[i][j]==-1) c=1;
					else{
						g[i][j]=c;
						c++;
					}
				}
			}
/*			for(int j=0;j<n;j++){
				for(int i=0;i<m;i++){
					if(g[i][j]==-1 && mb[i]==-1){
						mb[i]=j;
						mr[j]=i;
						ans++;
						break;
					}
				}
			}*/
			for(int i=0;i<n;i++){
				if(mr[i]==-1 && rb(0,i)) ans++;
			}
			System.out.println(ans);
			
		}
	}
}