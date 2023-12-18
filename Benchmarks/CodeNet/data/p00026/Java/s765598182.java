import java.util.*;
public class Main{
	public static void main(String[] a)throws java.io.IOException{
	Scanner scan=new Scanner(System.in);
	int [][] map = new int[10][10];
	for(int i=0;i<10;i++)
		for(int j=0;j<10;j++)
			map[i][j] =0;
	while(scan.hasNext()){
		String [] strs =scan.nextLine().split(",");
		int x=Integer.parseInt(strs[0]);
		int y=Integer.parseInt(strs[1]);
		int size=Integer.parseInt(strs[2]);
		
		switch (size){
		case 1:{
			int []dx ={0,1,0,-1,0};
			int []dy ={0,0,1,0,-1};
			for(int i=0;i<5;i++){
				int nx =x+dx[i];
				int ny =y +dy[i];
				if(0<=nx&&nx<10&&0<=ny&&ny<10)
					map[ny][nx]++;
			}
		}
			break;
		case 2:{
			for(int i=-1;i<=1;i++){
				for(int j=-1;j<=1;j++){
				int nx =x+j;
				int ny =y +i;
				if(0<=nx&&nx<10&&0<=ny&&ny<10)
					map[ny][nx]++;
				}
			}
			}
		
			break;
		case 3:{
			for(int i=-1;i<=1;i++){
				for(int j=-1;j<=1;j++){
				int nx =x+j;
				int ny =y +i;
				if(0<=nx&&nx<10&&0<=ny&&ny<10)
					map[ny][nx]++;
				}
			}
			int []dx ={2,0,-2,0};
			int []dy ={0,2,0,-2};
			for(int i=0;i<4;i++){
				int nx =x +dx[i];
				int ny =y +dy[i];
					if(0<=nx&&nx<10&&0<=ny&&ny<10)
						map[ny][nx]++;
			}
			}
			
			break;
			}
		
			}
	int max =0;
	int space =0;
	for(int i=0;i<10;i++){
		for(int j=0;j<10;j++){
			max =Math.max(map[i][j], max);
			if(map[i][j]==0)space++;
		}
	}
	System.out.println(space);
	System.out.println(max);
		}
}