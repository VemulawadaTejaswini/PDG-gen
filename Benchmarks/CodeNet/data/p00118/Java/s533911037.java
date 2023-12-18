import java.util.*;

public class Main {
	int h, w, d;
	int[][] map;
	ArrayDeque<Integer> x = new ArrayDeque<Integer>();
	ArrayDeque<Integer> y = new ArrayDeque<Integer>();

	public void func(){
		int count = 0;
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				if(map[i][j]>0){
					count++;
					d = map[i][j];
					x.push(j);
					y.push(i);
					check();
				}
			}
		}
		System.out.println(count);
	}
	
	public void check(){
		int z = 0;
		int px, py;
		while(true){
			z = x.size();
			for(int i=0;i<z;i++){
				px = x.pollLast();
				py = y.pollLast();
				if(py!=0 && map[py-1][px]==d){
					x.push(px);
					y.push(py-1);
				}
				if(py!=h-1 && map[py+1][px]==d){
					x.push(px);
					y.push(py+1);
				}
				if(px!=0 && map[py][px-1]==d){
					x.push(px-1);
					y.push(py);
				}
				if(px!=w-1 && map[py][px+1]==d){
					x.push(px+1);
					y.push(py);
				}
				map[py][px] = 0;
			}
			if(x.size()==0) break;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Main A = new Main();
		
		while(true){
			A.h = sc.nextInt();
			A.w = sc.nextInt();
			if(A.h==0 && A.w==0) break;
			
			A.map = new int[A.h][A.w];
			String s = "";
			for(int i=0;i<A.h;i++){
				s = sc.next();
				for(int j=0;j<A.w;j++){
					if(s.codePointAt(j)==64) A.map[i][j] = 1;
					else if(s.codePointAt(j)==35) A.map[i][j] = 2;
					else if(s.codePointAt(j)==42) A.map[i][j] = 3;
				}
			}
			A.func();
		}
		
	}	
}