import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int h, w, x, y;
		
		String str;
		
		char[][] tile;
		
		
		while(true){
			h = scan.nextInt();
			w = scan.nextInt();
			if(h == 0 && w == 0)break;
			
			tile = new char[h][w];
		
			for(int i = 0; i < h; i++){
				str = scan.next();
				char[] ch = str.toCharArray();
				for(int j = 0; j < w; j++){
					tile[i][j] = ch[j];
				}
			}
			
			x = 0;
			y = 0;
			
			while(true){
				if(tile[y][x] == '>'){
					tile[y][x] = 'n';
					x++;
				}else if(tile[y][x] == '<'){
					tile[y][x] = 'n';
					x--;
				}else if(tile[y][x] == '^'){
					tile[y][x] = 'n';
					y--;
				}else if(tile[y][x] == 'v'){
					tile[y][x] = 'n';
					y++;
				}else if(tile[y][x] == '.'){
					System.out.println(x + " " + y);
					break;
				}else if(tile[y][x] == 'n'){
					System.out.println("LOOP");
					break;
				}
			}
		
		}
	}
}