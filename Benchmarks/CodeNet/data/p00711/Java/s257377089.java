import java.util.*;
public class Main{
    static Scanner kbd = new Scanner(System.in);
    public static void main(String[] args){
	while(kbd.hasNext()){
	    int n = kbd.nextInt(); //横=x
	    int m = kbd.nextInt(); //縦=y
	    if(n!=0 && m!=0){
		solve(n, m);
	    }
	}
    }

    static void solve(int n, int m){
	int[][] field = new int[n][m];  //マップ(横*縦)
	Stack[] s = new Stack[2];  //行ける場所確保
	s[0] = new Stack(n*m);     // x座標
	s[1] = new Stack(n*m);     // y座標

	int i, j;
	int x=0, y=0, cnt=0; // 現在座標と踏んだタイルの数 
	for(i=0; i<m; i++){
	    String ss = kbd.next();
	    for(j=0; j<ss.length(); j++){
		String f = ss.substring(j, j+1);
		if(f.equals(".")){
		    field[j][i] = 1; // 1 = まだ踏んでいない
		}
		else if(f.equals("#")){
		    field[j][i] = -1;  // -1 = 進めない
		}
		else if(f.equals("@")){
		    field[j][i] = 0;  // 0 = スタートor 通過済み
		    x = j;
		    y = i;
		    cnt = 1;
		}
	    }
	}
	//フィールドセットここまで

	search(s, field, x, y, n, m);
	while(!(s[0].isEmpty() && s[1].isEmpty())){
	    x = (Integer)s[0].pop();
	    y = (Integer)s[1].pop();
	    if(field[x][y]==1){
		field[x][y] = 0;
		cnt++;
	    }
	    search(s, field, x, y, n, m);
	    //System.out.println(x+" "+y);
	}
	System.out.println(cnt);
    }

    static void search(Stack[] s, int[][] field, int x, int y, int n, int m){
	int a=x+1, b=x-1, c=y+1, d=y-1;
	if(a<n && field[a][y]==1){
	    s[0].push(a);
	    s[1].push(y);
	    //System.out.println((x+1)+" "+y);
	}
	if(b>=0 && field[b][y]==1){
	    s[0].push(b);
	    s[1].push(y);
	    //System.out.println((x-1)+" "+y);
	}
	if(c<m && field[x][c]==1){
	    s[0].push(x);
	    s[1].push(c);
	    //System.out.println(x+" "+(y+1));
	}
	if(d>=0 && field[x][d]==1){
	    s[0].push(x);
	    s[1].push(d);
	    //System.out.println(x+" "+(y-1));
	}
    }
}

class Stack{
    Object[] stack;
    int sp;
    public Stack(int n){
	stack = new Object[n];
	sp = 0;
    }
    public void push(Object x){
	stack[sp++] = x;
    }
    public Object pop(){
	return stack[--sp];
    }
    public boolean isEmpty(){
	return sp == 0;
    }
}