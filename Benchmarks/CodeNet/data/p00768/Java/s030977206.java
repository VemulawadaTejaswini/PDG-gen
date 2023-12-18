import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }

    Scanner kbd = new Scanner(System.in);

    void run(){
	while(kbd.hasNext()){
	    int m = kbd.nextInt();
	    int t = kbd.nextInt();
	    int p = kbd.nextInt();
	    int r = kbd.nextInt();
	    if(m!=0) solve(m, t, p, r); // m>=120より
	}
    }

    void solve(int m, int t, int p, int r){
	Data[] data = new Data[t]; // チームごとのデータ記録
	for(int i=0; i<t; i++){
	    data[i] = new Data(i+1, p);
	}
	while(r>0){
	    int time = kbd.nextInt();
	    int team = kbd.nextInt();
	    int pro = kbd.nextInt();
	    boolean cor;
	    int c = kbd.nextInt();
	    if(c==0)  cor = true;
	    else cor = false;
	
	    // 読み込み
	    data[team-1].sendPro(time, pro, cor);
	    r--;
	}
	// ソート
	 final boolean[][] same = new boolean[t+1][t+1];
	Arrays.sort(data, new Comparator<Data>(){
		public int compare(Data d1, Data d2){
		    int p1 = d1.getSolved();
		    int p2 = d2.getSolved();
		    if(p1 != p2) return p2-p1;
		    int time1 = d1.getTime();
		    int time2 = d2.getTime();
		    if(time1 != time2) return time1-time2;
		    int t1 = d1.getN();
		    int t2 = d2.getN();
		    same[t1][t2] = same[t2][t1] = true;
		    return t2-t1;
		}
	    }
	    );

	// 出力
	System.out.print(data[0].getN());
	for(int i=1; i<data.length; i++){
	    if(same[data[i].getN()][data[i-1].getN()])
		System.out.print("=");
	    else
		System.out.print(",");
	    System.out.print(data[i].getN());
	}
	System.out.println();
    }
}

class Data{
    int team;  //チーム番号
    int solved; // 解けた問題数
    int alltime; // かかった時間
    int[] pena;  // ペナルティ保存
    boolean[] solve;  // 解けているかどうか

    Data(int t, int p){  // p = 問題数
 	team = t;
	pena = new int[p];
	solve = new boolean[p];
    }

    void sendPro(int t, int p, boolean c){
	if(c){
	    alltime += (t + pena[p-1]);
	    solved++;
	    pena[p-1] = 0;
	}
	else pena[p-1] += 20;
    }

    int getTime(){ return alltime; }
    int getSolved(){ return solved; }
    int getN(){ return team;}
}