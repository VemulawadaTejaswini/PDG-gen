import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int w = sc.nextInt();
		int c = sc.nextInt();
		
		while(h != 0 || w != 0 || c != 0){
			int[][] p = new int[h + 2][w + 2];
			for(int i = 1; i <= h; i++){
				for(int j = 1; j <= w; j++){
					p[i][j] = sc.nextInt();
				}
			}
			int size = 0;
			for(int i = 1; i < p[1][1]; i++){
				size = Math.max(size, func(p, c, 1, i));
			}
			for(int i = p[1][1] + 1; i <= 6; i++){
				size = Math.max(size, func(p, c, 1, i));
			}
			System.out.println(size);
			
			h = sc.nextInt();
			w = sc.nextInt();
			c = sc.nextInt();
		}
		
		
		sc.close();
	}
	static int func(int[][] p, int c, int cnt, int drw){
		int size = 0;
		int oc = p[1][1];
		
		boolean[][] chk = new boolean[p.length][p[0].length];
		for(int i = 0; i < p.length; i++){
			Arrays.fill(chk[i], false);
		}
		int[][] cp = new int[p.length][p[0].length];
		for(int i = 0; i < p.length; i++){
			for(int j = 0; j < p[0].length; j++){
				cp[i][j] = p[i][j];
			}
		}
		
		LinkedList<A> list = new LinkedList<A>();
		
		list.push(new A(1, 1));
		while(!list.isEmpty()){
			A a = list.poll();
			if(!chk[a.h][a.w]){
				cp[a.h][a.w] = drw;
				chk[a.h][a.w] = true;
				
				if(!chk[a.h - 1][a.w] && p[a.h - 1][a.w] == oc){
					list.add(new A(a.h - 1, a.w));
				}
				if(!chk[a.h + 1][a.w] && p[a.h + 1][a.w] == oc){
					list.add(new A(a.h + 1, a.w));
				}
				if(!chk[a.h][a.w - 1] && p[a.h][a.w - 1] == oc){
					list.add(new A(a.h, a.w - 1));
				}
				if(!chk[a.h][a.w + 1] && p[a.h][a.w + 1] == oc){
					list.add(new A(a.h, a.w + 1));
				}
			}
		}

		if(cnt == 5){
			for(int i = 0; i < p.length; i++){
				Arrays.fill(chk[i], false);
			}
			list.push(new A(1, 1));
			while(!list.isEmpty()){
				A a = list.poll();
				if(!chk[a.h][a.w]){
					size++;
					chk[a.h][a.w] = true;
					if(!chk[a.h - 1][a.w] && cp[a.h - 1][a.w] == c){
						list.add(new A(a.h - 1, a.w));
					}
					if(!chk[a.h + 1][a.w] && cp[a.h + 1][a.w] == c){
						list.add(new A(a.h + 1, a.w));
					}
					if(!chk[a.h][a.w - 1] && cp[a.h][a.w - 1] == c){
						list.add(new A(a.h, a.w - 1));
					}
					if(!chk[a.h][a.w + 1] && cp[a.h][a.w + 1] == c){
						list.add(new A(a.h, a.w + 1));
					}
				}
			}
		}else if(cnt == 4){
			size = Math.max(size, func(cp, c, cnt + 1, c));
		}else{
			for(int i = 1; i < cp[1][1]; i++){
				size = Math.max(size, func(cp, c, cnt + 1, i));
			}
			for(int i = cp[1][1] + 1; i <= 6; i++){
				size = Math.max(size, func(cp, c, cnt + 1, i));
			}
		}
		return size;
	}
}
class A{
	int h;
	int w;
	A(int h, int w){
		this.h = h;
		this.w = w;
	}
}