import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		for(int k=0;k<t;k++){
			if(k!=0) System.out.println();
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			char[][] map = new char[h][w];
			for(int i=0;i<h;i++) map[i] = sc.next().toCharArray();
			int n = sc.nextInt();
			char[] s = new char[n];
			s = sc.next().toCharArray();
			
			
			int x = 0;
			int y = 0;
			int d = 0;
			boolean flag = false;
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(map[i][j]=='^'){
						d = 0;
						flag = true;
					}else if(map[i][j]=='>'){
						d = 1;
						flag = true;
					}else if(map[i][j]=='v'){
						d = 2;				
						flag = true;
					}else if(map[i][j]=='<'){
						d = 3;
						flag = true;
					}
					if(flag==true){
						map[i][j] = '.';
						y = i;
						x = j;
						i = h;
						j = w;
					}
				}
			}
			
			for(int i=0;i<n;i++){
				if(s[i]=='U'){
					d = 0;
					if(y>0 && map[y-1][x]=='.') y--;
				}else if(s[i]=='R'){
					d = 1;
					if(x<w-1 && map[y][x+1]=='.') x++;
				}else if(s[i]=='D'){
					d = 2;
					if(y<h-1 && map[y+1][x]=='.') y++;
				}else if(s[i]=='L'){
					d = 3;
					if(x>0 && map[y][x-1]=='.') x--;
				}else{
					if(d==0){
						for(int j=y;j>=0;j--){
							if(map[j][x]=='#') break;
							if(map[j][x]=='*'){
								map[j][x]='.';
								break;
							}
						}
					}else if(d==1){
						for(int j=x;j<w;j++){
							if(map[y][j]=='#') break;
							if(map[y][j]=='*'){
								map[y][j]='.';
								break;
							}
						}
					}else if(d==2){
						for(int j=y;j<h;j++){
							if(map[j][x]=='#') break;
							if(map[j][x]=='*'){
								map[j][x]='.';
								break;
							}
						}
					}else if(d==3){
						for(int j=x;j>=0;j--){
							if(map[y][j]=='#') break;
							if(map[y][j]=='*'){
								map[y][j]='.';
								break;
							}
						}
					}
				}
			}
			if(d==0) map[y][x] = '^';
			else if(d==1) map[y][x] = '>';
			else if(d==2) map[y][x] = 'v';
			else if(d==3) map[y][x] = '<';
			
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
			
		}
	}	
}