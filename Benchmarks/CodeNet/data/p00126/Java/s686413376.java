import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner kbd = new Scanner(System.in);
    void run(){
	int n = kbd.nextInt();
	int data = 0;
	while(n>0){
	    if(data>0)
		System.out.println();
	    solve();
	    n--;
	    data++;
	}
    }


    void solve(){
	int[][] field = new int[9][9];
	boolean[][] tf = new boolean[9][9]; // 正しい入力がされているか？
	int i, j;
	for(i=0; i<9; i++)	
	    Arrays.fill(tf[i], true);
	for(i=0; i<9; i++){
	    for(j=0; j<9; j++){
		field[i][j] = kbd.nextInt();
	    }
	}
	// 入力ここまで

	// チェックここから
	/*
	  1から9までが1つずつ使われていればtrue
	  足りない数字がある = 多い数字があるから、多いマスをfalseにする
	*/

	int[] c; // チェックする数字の固まり
	int[][] x; // チェック中の座標

	// i ラインチェック
	for(i=0; i<9; i++){
	    c = new int[9];
	    x = new int[9][2];
	    for(j=0; j<9; j++){
		int d = field[i][j]-1; // マスにある数字
		c[d]++;
		if(c[d]>1){
		    tf[i][j] = false;
		    tf[x[d][0]][x[d][1]] = false;
		}
		else{
		    x[d][0] = i;
		    x[d][1] = j;
		}
	    }
	}

	// j ラインチェック
	for(j=0; j<9; j++){
	    c = new int[9];
	    x = new int[9][2];
	    for(i=0; i<9; i++){
		int d = field[i][j]-1; // マスにある数字
		c[d]++;
		if(c[d]>1){
		    tf[i][j] = false;
		    tf[x[d][0]][x[d][1]] = false;
		}
		else{
		    x[d][0] = i;
		    x[d][1] = j;
		}
	    }
	}

	// 四角区切りチェック
	for(int si=0; si<9; si+=3){
	    for(int sj=0; sj<9; sj+=3){
		c = new int[9];
		x = new int[9][2];
		for(i=si; i<si+3; i++){	    
		    for(j=sj; j<sj+3; j++){
			int d = field[i][j]-1; // マスにある数字
			c[d]++;
			if(c[d]>1){
			    tf[i][j] = false;
			    tf[x[d][0]][x[d][1]] = false;
			}
			else{
			    x[d][0] = i;
			    x[d][1] = j;
			    //System.out.println("*"+x[d][0]+" "+x[d][1]+"*");
			}
		    }
		}
		//System.out.println();
	    }
	}
	    
	// 表示
	for(i=0; i<9; i++){
	    for(j=0; j<9; j++){
		if(tf[i][j]){
		    System.out.print(" "+field[i][j]);
		}
		else 
		    System.out.print("*"+field[i][j]);
	    }
	    System.out.println();
	}
    }
}
	