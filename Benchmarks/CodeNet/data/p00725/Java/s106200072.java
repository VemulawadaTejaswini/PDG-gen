import java.io.*;
import java.util.*;

public class Main{
	int w,h;
	int[] px={0,1,0,-1};
	int[] py={1,0,-1,0};
	int gx,gy,sx,sy;
	int res=11;
	public void dfs(int[][] fie2,int x,int y,int c,int m){
		if(c>=res)return;
		if(x==gx && y==gy){
			res=Math.min(res,c);
			return;
		}
		//System.out.printf("%d %d %d %d\n",x,y,c,m);
		if(m==-1){
			for(int i=0;i<4;i++){
				if(x+px[i]>=0 && x+px[i]<w && y+py[i]>=0 && y+py[i]<h)if(fie2[x+px[i]][y+py[i]]==0)dfs(fie2,x,y,c+1,i);
			}
		}else{
			if(x+px[m]>=0 && x+px[m]<w && y+py[m]>=0 && y+py[m]<h){
				if(fie2[x+px[m]][y+py[m]]==1){
					fie2[x+px[m]][y+py[m]]=0;
					for(int i=0;i<4;i++){
						if(x+px[i]>=0 && x+px[i]<w && y+py[i]>=0 && y+py[i]<h){
							if(fie2[x+px[i]][y+py[i]]==0)dfs(fie2,x,y,c+1,i);
						}
					}
					fie2[x+px[m]][y+py[m]]=1;
				}else dfs(fie2,x+px[m],y+py[m],c,m);
			}
		}
		return;
	}
	int[][] fie;
	public void run(){
		Scanner sc=new Scanner(System.in);
		while(true){
			w=sc.nextInt();
			h=sc.nextInt();
			fie=new int[w][h];
			res=11;
			if(w+h==0)break;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					fie[j][i]=sc.nextInt();
					if(fie[j][i]==2){
						sx=j;
						sy=i;
						fie[j][i]=0;
					}
					if(fie[j][i]==3){
						gx=j;
						gy=i;
						fie[j][i]=0;
					}
				}
			}
			dfs(fie,sx,sy,0,-1);
			if(res<=10)System.out.printf("%d\n",res);
			else System.out.printf("%d\n",-1);
		}
	}
	public static void main(String args[]){
		new Main().run();
	}
}