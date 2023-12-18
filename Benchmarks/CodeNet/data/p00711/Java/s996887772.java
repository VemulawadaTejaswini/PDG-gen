import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int w, h;
    char[][] map;
    int c;
    int[] dx = {0, 0, 1, -1};
    int[] dy = {1, -1, 0, 0};

    void run(){
	while(true){
	    w = sc.nextInt();
	    h = sc.nextInt();
	    if(h==0 && w==0) break;
	    c = 1;
	    map = new char[h][w];
	    int sx=0, sy=0;
	
	    for(int i=0; i<h; i++){
		String s = sc.next();
		map[i] = s.toCharArray();
		for(int k=0; k<w; k++)
		    if(map[i][k]=='@'){
			sx = k;
			sy = i;
		    }
	    }

	    solve(sx, sy);
	    System.out.println(c);
	}
    }

    void solve(int x, int y){
	int p, q;
	Stack<int[]> st = new Stack<int[]>();
	
	for(int i=0; i<4; i++){
	    p = x+dx[i];
	    q = y+dy[i];
	    if(p<0 || p>=w || q<0 || q>=h) continue;
	    if(map[q][p]=='.'){
		//System.out.println(q+" "+p);
		st.push(new int[]{q, p});
	    }
	}
	
	while(!st.isEmpty()){
	    int[] a = st.pop();
	    x = a[1];
	    y = a[0];
	    //System.out.println(map[y][x]+" "+y+" "+x);
	    if(map[y][x]!='.') continue;
	    for(int i=0; i<4; i++){
		p = x+dx[i];
		q = y+dy[i];
		if(p<0 || p>=w || q<0 || q>=h) continue;
		if(map[q][p]=='.'){
		    //System.out.println(q+" "+p);
		    st.push(new int[]{q, p});
		}
	    }
	    c++;
	    map[y][x] = '#';
	}
    }
}
		    