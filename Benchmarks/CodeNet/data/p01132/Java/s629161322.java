import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ2007().doIt();
	}
	
	class AOJ2007{
		int n,INF = Integer.MAX_VALUE/5;
		int[] a,money;
		Data ans;
		
		void dfs(Data d){
			if(d.siharai<=0){
				d.getMoney(Math.abs(d.siharai));
				if(ans.sum > d.sum)ans = new Data(d.ten, d.five, d.hand, d.fhand, INF);	
			}
			int ten = d.ten,five = d.five,hand = d.hand,fhand = d.fhand;
			for(int i=1;i<=ten;i++)dfs(new Data(ten-i, five, hand, fhand, d.siharai-(i*10)));
			for(int i=1;i<=five;i++)dfs(new Data(ten, five-i, hand, fhand, d.siharai-(i*50)));
			for(int i=1;i<=hand;i++)dfs(new Data(ten, five, hand-i, fhand, d.siharai-(i*100)));
			for(int i=1;i<=fhand;i++)dfs(new Data(ten, five, hand, fhand-i, d.siharai-(i*500)));
		}
		void solve(){
			ans = new Data(INF,INF,INF,INF,0);
			dfs(new Data(money[0], money[1], money[2], money[3], n));
//			System.out.println(ans.ten+" "+ans.five+" "+ans.hand+" "+ans.fhand);
			int[] result = new int[4];
			result[0] = money[0]-ans.ten;
			result[1] = money[1]-ans.five;
			result[2] = money[2]-ans.hand;
			result[3] = money[3]-ans.fhand;
			for(int i=0;i<4;i++)if(result[i]>0){
				System.out.println(a[i]+" "+result[i]);
			}
		}
		
		void doIt(){
			a = new int[4];
			a[0] = 10;a[1] = 50;a[2] = 100;a[3] = 500;
			n = in.nextInt();
			if(n==0)return;
			money = new int[4];
			for(int i=0;i<4;i++)money[i] = in.nextInt();
			solve();
			while(in.hasNext()){
				n = in.nextInt();
				if(n==0)break;
				money = new int[4];
				for(int i=0;i<4;i++)money[i] = in.nextInt();
				System.out.println();
				solve();
			}
		}
		
		class Data{
			int money[];
			int sum;
			int ten,five, hand, fhand;
			int siharai;
			public Data(int ten,int five,int hand,int fhand,int n){
				this.ten = ten;this.five = five;this.hand = hand;this.fhand = fhand;
				sum = ten+five+hand+fhand;
				siharai = n;
			}
			void getMoney(int s){
				for(int i=3;i>=0;i--){
					while(s>=a[i]){
						s-=a[i];sum++;
					}
				}
			}
			
		}
	}
}