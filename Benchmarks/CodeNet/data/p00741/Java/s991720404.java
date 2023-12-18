import java.util.*;
public class Main{
	public static int[][] map;
	public static int w,h;
	public static void check(int x,int y){
		if(map[x][y]==1){
			map[x][y]=0;
			if(x!=w-1){
				check(x+1,y);
			}
			if(y!=h-1){
				check(x,y+1);
			}
			if(x!=w-1&&y!=h-1){
				check(x+1,y+1);
			}
			if(y!=0&&x!=w-1){
				check(x+1,y-1);
			}
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int count;
		while(true){
			w=sc.nextInt();
			h=sc.nextInt();
			if(h!=0||w!=0){
				count=0;
				map=new int[w][h];
				for(int i=0;i<w;i++){
					for(int j=0;j<h;j++){
						map[i][j]=sc.nextInt();
					}
				}
				for(int i=0;i<w;i++){
					for(int j=0;j<h;j++){
						if(map[i][j]==1){
							check(i,j);
							count++;
						}
					}
				}
				System.out.println(count);
			}
			else{
				break;
			}
		}
	}
}
