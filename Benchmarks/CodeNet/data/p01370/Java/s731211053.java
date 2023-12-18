import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);
    Queue<Field> que;
    HashSet<String> visit;
    HashSet<String> none;
    //int[][] visit;
    //int[][] none;
    int went;
    int n;
    int t;
    int turn;
    String now;

    void run(){
	while(kbd.hasNext()){
	    t = kbd.nextInt(); // ターン数
	    n = kbd.nextInt(); // 障害物数
	    // System.out.println(t+" "+n);
	    turn = 0;     // 移動出来るマスの記録用
	    if(t==0) break;	    

	    que = new LinkedList<Field>();
	    // 移動できるマスの座標

	    visit = new HashSet<String>();
	    //visit = new int[1000][2];
	    went = 0;
	    // 移動済のマスの座標

	    none = new HashSet<String>();
	    //none = new int[n][2];
	    // 障害物のマスの座標

	    // スタート座標 兼 現在の座標
	    int x, y, i=0;
	    
	    // 障害物 マス保存
	    i=0;
	    while(i<n){
		x = kbd.nextInt();
		y = kbd.nextInt();
		now = x+" "+y;
		/*
		none[i][0] = x;
		none[i][1] = y;
		*/
		none.add(now);
		i++;
	    }

	    // スタート座標 兼 現在の座標
	    x = kbd.nextInt();
	    y = kbd.nextInt();
	    now = x+" "+y;
	    visit.add(now);
	    /*
	    visit[went][0] = x;
	    visit[went][1] = y;
	    went++;
	    */

	    //System.out.println(x+" "+y);
	    int cnt = 1;  // 到達可能なマスの数、1はスタート地点
	    turn = 1;
	    setField(x+1, y, turn);
	    setField(x+1, y+1, turn);
	    setField(x, y+1, turn);

	    setField(x-1, y, turn);
	    setField(x-1, y-1, turn);
	    setField(x, y-1, turn);

	    // 移動始めここから
	    while(!que.isEmpty()){
		// 移動可能なマスのうち一つに移動する
		Field next = que.poll();
		x = next.getX();
		y = next.getY();
		now = x+" "+y;
		turn = next.getT();
		// System.out.println(x+" "+y);
		boolean a = true;
		/*
		i=0;
		while(i<went){
		    if(visit[i][0]==x && visit[i][1]==y) a = false;
		    i++;
		}
		*/
		if(!visit.contains(now)){
		    /*
		    visit[went][0] = x;
		    visit[went][1] = y;
		    went++;
		    */
		    now = x+" "+y;
		    visit.add(now);	
		    cnt++;
		    //System.out.println("*"+went);
		}
		    // 現在のマスから、移動可能なものを探してaddする
		if(turn+1<=t){
		    setField(x+1, y, turn+1);
		    setField(x+1, y+1, turn+1);
		    setField(x, y+1, turn+1);
		    
		    setField(x-1, y, turn+1);
		    setField(x-1, y-1, turn+1);
		    setField(x, y-1, turn+1);
		}
	    }
	    System.out.println(cnt);
	}
    }

    void setField(int x, int y, int t){
	boolean a = true;
	int i=0;
	/*
	while(i<went){
	    if(visit[i][0]==x && visit[i][1]==y) a = false;
	    i++;
	}
	*/
	now = x+" "+y;
	if(visit.contains(now)) a = false;
	/*
	i=0;
	while(i<n){
	    if(none[i][0]==x && none[i][1]==y) a = false;
	    i++;
	}
	*/
	if(none.contains(now)) a = false;
	if(a){
	    que.add(new Field(x, y, t));
	    //System.out.println(x+" "+y+" "+t);
	}
    }
}

class Field{
    int x;
    int y;
    int turn;
    public Field(int xx, int yy){
	x = xx;
	y = yy;
	turn = 500;
    }

    public Field(int xx, int yy, int tt){
	x = xx;
	y = yy;
	turn = tt;
    }
    public int getX(){ return x; }
    public int getY(){ return y; }
    public int getT(){ return turn; }
}