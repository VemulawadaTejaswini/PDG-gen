import java.util.Scanner;

public class Main {
	static int map[][]=new int[8][8];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,n,x,y,k=1;
		n=sc.nextInt();
		while(n--!=0){
			for(i=0;i<8;i++){
				String str=sc.next();
				char ch[]=str.toCharArray();
				for(j=0;j<8;j++){
					map[i][j]=ch[j]-'0';
				}
			}//i
			x=sc.nextInt();
			y=sc.nextInt();
			
			bomb(y-1,x-1);
			
			System.out.printf("Data %d:\n",k++);
			for(i=0;i<8;i++){	
				for(j=0;j<8;j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}//while
	}
	public static void bomb(int y,int x){
		map[y][x]=0;
		if(x+1<8 && map[y][x+1]==1){
			bomb(y,x+1);
		}
		if(x+2<8 && map[y][x+2]==1){
			bomb(y,x+2);
		}
		if(x+3<8 && map[y][x+3]==1){
			bomb(y,x+3);
		}
		if(0<=x-1 && map[y][x-1]==1){
			bomb(y,x-1);
		}
		if(0<=x-2 && map[y][x-2]==1){
			bomb(y,x-2);
		}
		if(0<=x-3 && map[y][x-3]==1){
			bomb(y,x-3);
		}
		if(y+1<8 && map[y+1][x]==1){
			bomb(y+1,x);
		}
		if(y+2<8 && map[y+2][x]==1){
			bomb(y+2,x);
		}
		if(y+3<8 && map[y+3][x]==1){
			bomb(y+3,x);
		}
		if(0<=y-1 && map[y-1][x]==1){
			bomb(y-1,x);
		}
		if(0<=y-2 && map[y-2][x]==1){
			bomb(y-2,x);
		}
		if(0<=y-3 && map[y-3][x]==1){
			bomb(y-3,x);
		}
	}//bomb
}