import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main(){
		new AOJ1135().doIt();
	}
	
	class AOJ1135{
		int nen,n,kin;
		Data[] data;
		
		int tanri(Data d){
			int result = 0;
			int a = kin;
			int b = 0;
			for(int i=0;i<nen;i++){
				b += (int)(a*d.ri);
				a -= d.mkin;
			}
			result = a+b;
			return result;
		}
		
		int fukuri(Data d){
			int result = 0;
			int a = kin;
			for(int i=0;i<nen;i++){
				a = (int)(a*(1+d.ri));
				a-=d.mkin;
			}
			result = a;
			return result;
		}
		
		void solve(){
			int result = -1;
			for(int i=0;i<n;i++){
				if(data[i].fukuri)result = Math.max(result, fukuri(data[i]));
				else result = Math.max(result, tanri(data[i]));
			}
			System.out.println(result);
		}
		
		void doIt(){
			int m = in.nextInt();
			for(int i=0;i<m;i++){
				kin = in.nextInt();
				nen = in.nextInt();
				n = in.nextInt();
				data = new Data[n];
				for(int s=0;s<n;s++)data[s] = new Data(in.nextInt(),in.nextDouble(), in.nextInt());
				solve();
			}
		}
		class Data{
			double ri,mkin;
			boolean fukuri;
			public Data(int which,double ri,int mkin){
				fukuri = which==1;
				this.ri = ri;
				this.mkin = mkin;
			}
		}
	}
	
}