import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    boolean[][] map;
    boolean[][] visit;
    int c;
    Stack<int[]> st;
    int[] dirX = { 1, 0, 0, -1 };
    int[] dirY = { 0, 1, -1, 0 };

    void run(){
	while(sc.hasNext()){
	    map = new boolean[12][12];
	    visit = new boolean[12][12];
	    for(int i=0; i<12; i++)
		makeMap(sc.next(), i);
	    //show();
	    c = 0;
	    solve();
	    System.out.println(c);
	}
    }

    void solve(){
	st = new Stack<int[]>();
	for(int i=0; i<12; i++)
	    for(int k=0; k<12; k++)
		if(map[i][k] && !visit[i][k]){
		    //System.out.println("------"+i+" "+k+"-----");
		    c++;
		    search(i, k);
		    //showM();
		}
    }

    void search(int y, int x){
	int[] p = new int[2];
	getGo(y, x);
	while(!st.empty()){
	    p = st.pop();
	    //System.out.println(p[1]+" "+p[0]);
	    if(!visit[p[0]][p[1]]) getGo(p[0], p[1]);
	}
    }

    void getGo(int y, int x){
	visit[y][x] = true;
	for(int i=0; i<4; i++){
	    int a = y+dirY[i];
	    int b = x+dirX[i];
	    if(a>=0 && a<12 && b>=0 && b<12 && map[a][b] && !visit[a][b]){
		//System.out.println("** "+x+" "+y+" / "+a+" "+b);
		int[] p = { a, b };
		st.push(p);
	    }
	}
    }

    void show(){
	for(int i=0; i<12; i++){
	    for(int k=0; k<12; k++)
		System.out.print(map[i][k] ? "■":"□");
	    System.out.println();
	}
    } 

    void showM(){
	for(int i=0; i<12; i++){
	    for(int k=0; k<12; k++)
		System.out.print(map[i][k] && visit[i][k] ? "■":"□");
	    System.out.println();
	}
    }

    void makeMap(String t, int i){
	for(int k=0; k<12; k++)
	    map[i][k] = t.substring(k, k+1).equals("1") ? true:false;
    }
}