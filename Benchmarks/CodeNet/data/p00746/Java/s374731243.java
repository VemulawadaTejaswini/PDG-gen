import java.util.Scanner;
public class Main {
	static Scanner stdIn = new Scanner(System.in);
	public static void main(String args[]){
		while(true){
			int N=stdIn.nextInt();
			if(N==0){
				break;
			}
			int xMax=0,xMin=0,yMax=0,yMin=0,pos,tmp;
			Table[] tbl = new Table[N];
			tbl[0] = new Table();
			tbl[0].x=0;
			tbl[0].y=0;
			for(int i=1;i<N;i++){
				tbl[i]= new Table();
				tmp=stdIn.nextInt();
				pos=stdIn.nextInt();
				func(tbl,i,tmp,pos);
				if(xMax<tbl[i].x)
					xMax=tbl[i].x;
				else if(xMin>tbl[i].x)
					xMin=tbl[i].x;
				if(yMax<tbl[i].y)
					yMax=tbl[i].y;
				else if(yMin>tbl[i].y)
					yMin=tbl[i].y;
			}
			System.out.println((xMax-xMin+1)+" "+(yMax-yMin+1));
		}
	}
	private static void func(Table[] tbl, int i, int tmp, int pos) {
		switch(pos){
		case 0:tbl[i].x=tbl[tmp].x-1; tbl[i].y=tbl[tmp].y; break;
		case 1:tbl[i].x=tbl[tmp].x; tbl[i].y=tbl[tmp].y-1; break;
		case 2:tbl[i].x=tbl[tmp].x+1; tbl[i].y=tbl[tmp].y; break;
		case 3:tbl[i].x=tbl[tmp].x; tbl[i].y=tbl[tmp].y+1; break;
		}
	}
	
}
class Table{
	int x,y;	
}