import java.util.*;
public class Main {
	static int[][] masu = new int[10][10];
	static void doIt(int x,int y,int size){
		switch(size){
		case 1:
			small(x,y);
			break;
		case 2:
			mid(x,y);
			break;
		case 3:
			big(x,y);
			break;
		}
	}
	static void small(int x,int y){
		int sx[]={1,0,-1,0},sy[]={0,1,0,-1};
		draw(x,y);
		for(int i=0;i<4;i++){
			int nx=sx[i]+x;
			int ny=sy[i]+y;
			draw(nx,ny);
		}
	}
	static void mid(int x,int y){
		for(int s=-1;s<2;s++){
			for(int i=-1;i<2;i++){
				draw(x+i,y+s);
			}
		}
	}
	static void big(int x,int y){
		mid(x,y);
		draw(x,y-2);draw(x,y+2);draw(x+2,y);draw(x-2,y);
	}
	static void draw(int x,int y){
		if(x<0||y<0||x>9||y>9)return;
		masu[y][x]+=1;
	}
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		for(int s=0;s<10;s++)for(int i=0;i<10;i++)masu[s][i]=0;
		while(in.hasNext()){
			String[] input = in.next().split(",");
			int x=Integer.parseInt(input[0]),y=Integer.parseInt(input[1]),size=Integer.parseInt(input[2]);
			doIt(x,y,size);
		}
		int big=0, cnt=0;
		for(int s=0;s<10;s++)for(int i=0;i<10;i++){
			big=Math.max(big, masu[s][i]);
			if(masu[s][i]==0)cnt++; 
		}
		System.out.println(cnt);
		System.out.println(big);
	}
}