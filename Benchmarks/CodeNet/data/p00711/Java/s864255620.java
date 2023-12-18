import java.util.*;

public class Main {
	static int w, h, count, before;
	static int[][] dir = {{-1,0}, {0,-1}, {1,0}, {0, 1}};
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			w = sc.nextInt();
			h = sc.nextInt();
			sc.nextLine();
			if(w == 0){
				break;
			}

			int[] pos = new int[2];
			int [][] c = new int[h][w];
			char abc;
			String str = new String();
			for(int i = 0; i < h; i++){/* ????????? */
				str = sc.nextLine();/* ?????§???????????? */
				for(int j = 0; j < w; j++){
					abc = str.charAt(j);
					if(abc == '#'){
						c[i][j] = 0;
					}else if(abc == '.'){
						c[i][j] = 1;
					}else if(abc == '@'){
						c[i][j] = 1;
						pos[0] = i;
						pos[1] = j;
					}
				}
			}
			
			count = 0;
			before = 1;
			int y;
			y = search(c , pos[0], pos[1]);
			
			System.out.println(count);
		}
	}
	
	public static int search(int[][] c, int i, int j){
		if(c[i][j] == 0){
			return 0;
		}
		c[i][j] = 0;
		count++;
		
		int d = before + 2/* ????????°????????????????????´???????§???? */;
		if(d > 3){
			d -= 4;
		}
		
		for(int k = 0; k < 4; k++){
			d++;
			if(d > 3){
				d -= 4;
			}
			
			before = d;
			int x = i + dir[d][0], y = j + dir[d][1];
			if((x >= 0) && (x < h) && (y >= 0) && (y < w)){
				int z = search(c, x, y);
			}
		}		
		return 1;
	}
}