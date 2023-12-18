import java.util.Scanner;

class Masu{
	int id;
	int value;
	Masu(int e,int a){
		id=e;
		value=a;
	}
}

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main().run();
	}
	int x,V[];
	int Y;
	Masu[] map;
	void run(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			x=sc.nextInt();
			Y=sc.nextInt();
			int Z=sc.nextInt();
			if(x+Y+Z==0) break;
			
			V=new int[x];
			for(int i=0;i<x;i++){
				V[i]=sc.nextInt();
			}
			map=new Masu[Y];
			for(int i=0;i<Y;i++){
				map[i]=new Masu(0, 0);
			}
			for(int i=0;i<Z;i++){
				int k=sc.nextInt();
				map[k]=new Masu(sc.nextInt(), sc.nextInt());
			}
			memo=new double[Y][5000];
			bt(1,0,0);
			double p=0;
			for(int i=0;i<5000;i++){
				//System.out.print(" "+memo[0][i]);
				p+=memo[0][i];
			}
			//System.out.println();
			System.out.println((int)Math.floor(p));
		}
	}
	double memo[][];
	double bt(int d,int n,int money){
		if(Y<=n){
			double m=money;
			double depth=d;
			return m/depth;
		}
		
		if(memo[n][money]!=0) return memo[n][money];
		
		//現在いるマスの特殊処理
		if(map[n].id==1){
			n+=map[n].value;
		}
		else if(map[n].id==2){
			money+=map[n].value;
		}
		else if(map[n].id==3){
			money-=map[n].value;
			if(money<0) money=0;
		}
		//
		for(int i=0;i<x;i++){
			memo[n][money]+=bt(d*x,n+V[i],money);
		}
		return memo[n][money];
	}
}