import java.util.Scanner;
public class Main {
	static int bord[][]=new int[10][10];
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x,y,size,i,j,count=0,max=0;
		while(s.hasNext()){
			String[] str = s.next().split(",");
			x = Integer.parseInt(str[0]);
			y = Integer.parseInt(str[1]);
			size = Integer.parseInt(str[2]);
			if(size==1){
				small(x,y);
			}
			if(size==2){
				middle(x,y);
			}
			if(size==3){
				large(x,y);
			}
		}//while
		for(i=0;i<10;i++){
			for(j=0;j<10;j++){
				if(bord[i][j]==0)
					count++;
				if(bord[i][j]>max)
					max=bord[i][j];
			}
		}
		System.out.println(count);
		System.out.println(max);
	}//main
	public static void small(int x,int y){
		bord[x][y]++;
		if(x-1>-1)
			bord[x-1][y]++;
		if(x+1<10)
			bord[x+1][y]++;
		if(y-1>-1)
			bord[x][y-1]++;
		if(y+1<10)
			bord[x][y+1]++;
	}
	public static void middle(int x,int y){
		small(x,y);
		if(x-1>-1 && y-1>-1)
			bord[x-1][y-1]++;
		if(x+1<10 && y+1<10)
			bord[x+1][y+1]++;
		if(x+1<10 && y-1>-1)
			bord[x+1][y-1]++;
		if(x-1>-1 && y+1<10)
			bord[x-1][y+1]++;
	}
	public static void large(int x,int y){
		middle(x,y);
		if(x-2>-1)
			bord[x-2][y]++;
		if(x+2<10)
			bord[x+2][y]++;
		if(y-2>-1)
			bord[x][y-2]++;
		if(y+2<10)
			bord[x][y+2]++;
	}
}