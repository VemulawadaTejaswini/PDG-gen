import java.util.*;

public class Main {

	int w, h, count, cb, cw;
	int[][] map;
	boolean black, white;
	
	public void func(){
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]==0){
					count = 0;
					black = true;
					white = true;
					loop(i, j);
					if(black==false && white==true){
						cb += count;
					}else if(black==true && white==false){
						cw += count;
					}
				}
			}
		}
		System.out.println(cb + " " + cw);
	}
	
	public void loop(int y, int x){
		if(map[y][x]==8){
			black = false;
		}else if(map[y][x]==9){
			white = false;
		}else if(map[y][x]==0){
			map[y][x] = 1;
			count++;
			if(y!=0) loop(y-1,x);
			if(x!=0) loop(y,x-1);
			if(y!=h-1) loop(y+1,x);
			if(x!=w-1) loop(y,x+1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			Main A = new Main();
			A.w = sc.nextInt();
			A.h = sc.nextInt();
			if(A.w==0 && A.h==0)break;
			A.map = new int[A.h][A.w];
			String s = "";
			for(int i=0;i<A.h;i++){
				s = sc.next();
				for(int j=0;j<A.w;j++){
					if(s.codePointAt(j)==66) A.map[i][j]=8;
					else if(s.codePointAt(j)==87) A.map[i][j]=9;
				}
			}
			A.func();
			
		}
	}	
}