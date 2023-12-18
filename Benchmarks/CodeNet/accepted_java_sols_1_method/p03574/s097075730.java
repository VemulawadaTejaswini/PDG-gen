import java.util.*;

public class Main {
	public static void main(String[] args) {
		int cnt = 0;
		String str = "";
		
		Scanner sc = new Scanner(System.in);

		int h = sc.nextInt();
		int w = sc.nextInt();
		char map[][] = new char[h][w];	
		
		for(int i=0;i<h;i++) {
			str = sc.next();
			for(int j=0;j<w;j++)
				map[i][j] = str.charAt(j);
		}
		
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				if(map[i][j] != '#') {
					cnt = 0;
					
					for(int x=-1;x<=1;x++) {
						for(int y=-1;y<=1;y++) {
							if( j+x<0 || w<=j+x || i+y<0 || h<=i+y || (x==0 && y==0) )
								continue;
							if( map[i+y][j+x]=='#' )
								cnt++;
						}
					}
					// int→charの変換(ASCIIコードで「(int)49→(char)'1'」だから)
					// もっと適切な方法がありそう
					map[i][j] = (char)(cnt+48);
				}
			}
		}
		
		for(int i=0;i<h;i++) {
			str = String.valueOf(map[i]);
			System.out.println(str);
		}
		
	}
}
	
	
