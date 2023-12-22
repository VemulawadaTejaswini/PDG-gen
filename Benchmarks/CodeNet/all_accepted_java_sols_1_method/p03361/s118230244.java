import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		try(Scanner scan = new Scanner(System.in)){
			
			int H = scan.nextInt();
			int W = scan.nextInt();
			String[]S = new String[H];
			char[][]s = new char[H][W];
			
			for(int i = 0;i<H;i++) {
				S[i] = scan.next();
				s[i] = S[i].toCharArray();
			}
			
			int dy[] = {1,0,-1,0};
			int dx[] = {0,1,0,-1};//上右下左
			
			boolean ok =true;
			
			outside:for(int i = 0;i<H;i++) {
				for(int j = 0;j<W;j++) {
					if(s[i][j]=='#') {
						int  count = 0;
						for(int z = 0;z<4;z++) {
							int x = j+dx[z];
							int y = i+dy[z];
							
							if(0<=x&&x<W&&0<=y&&y<H) {
								if(s[y][x]=='#')
								count++;
							}
						}
						if(count==0) {
							//System.out.println(""+i+" "+j+"");
							ok =false;
							break outside;
						}
						
						
						
					}
				}
			}
			
			System.out.println(ok?"Yes":"No");
			
			
			
		}	
	}
}
