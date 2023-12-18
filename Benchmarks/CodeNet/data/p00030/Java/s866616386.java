import java.util.*;
public class Main {	
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new AOJ0030();
	}
	
	
	class AOJ0030{
		int bfs(int nowN,int Sum,int before){//現在の足した回数,足した合計値,前の数
			int cnt = 0;
			if(ans>ans)return 0;//超えている時点でアウト
			if(nowN == n){
				if(Sum == ans)return 1;//nかつansの場合1を返す。
				else return 0;//そうでない時は0
			}
			for(int i=before;i<10;i++){
				cnt+=bfs(nowN+1,Sum+i,i+1);
			}
			return cnt;
		}
		int n,ans;
		AOJ0030(){
			Scanner in = new Scanner(System.in);
			while(true){
				n = in.nextInt();
				ans = in.nextInt();
				if(n+ans==0)break;
				int result = bfs(0,0,0);
				System.out.println(result);
			}
		}
		
		
		
	}
}