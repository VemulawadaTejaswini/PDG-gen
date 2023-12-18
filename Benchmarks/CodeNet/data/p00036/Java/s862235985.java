import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ0036().doIt();
	}
	
	class AOJ0036{
		boolean map[][];
		int ax[] = {0,1,0,1};
		int ay[] = {0,0,1,1};
		int bx[] = {0,0,0,0};
		int by[] = {0,1,2,3};
		int cx[] = {0,1,2,3};
		int cy[] = {0,0,0,0};
		int dx[] = {0,0,-1,-1};
		int dy[] = {0,1,1,2};
		int ex[] = {0,1,1,2};
		int ey[] = {0,0,1,1};
		int fx[] = {0,0,1,1};
		int fy[] = {0,1,1,2};
		int gx[] = {0,1,0,-1};
		int gy[] = {0,0,1,1};
		char test(int x,int y){
			int cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+ax[i];
				int ny = y+ay[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'A';
			cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+bx[i];
				int ny = y+by[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'B';
			cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+cx[i];
				int ny = y+cy[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'C';
			cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+dx[i];
				int ny = y+dy[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'D';
			cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+ex[i];
				int ny = y+ey[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'E';
			cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+fx[i];
				int ny = y+fy[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'F';
			cnt = 0;
			for(int i=0;i<4;i++){
				int nx = x+gx[i];
				int ny = y+gy[i];
				if(nx<0||nx>=8||ny<0||ny>=8)continue;
				if(map[ny][nx]==false)continue;
				cnt++;
			}
			if(cnt==4)return 'G';
			return 'X';
		}
		
		void solve(){
			char result = ' ';
			for(int i=0;i<8;i++)for(int s=0;s<8;s++){
				char a = test(s, i);
				if(a!='X')result = a;
			}
			System.out.println(result);
		}
		
		void doIt(){
			while(in.hasNext()){
				map = new boolean[8][8];
				for(int i=0;i<8;i++){
					String text = in.next();
					for(int s=0;s<8;s++){
						if(text.charAt(s)=='1')map[i][s] = true;
						else map[i][s] = false;
					}
				}
//				
//				for(int i=0;i<8;i++){
//					for(int s=0;s<8;s++)System.out.print(map[i][s]? "1":"0");
//					System.out.println();
//				}
				
				solve();
				
			}
		}
	}
	
}