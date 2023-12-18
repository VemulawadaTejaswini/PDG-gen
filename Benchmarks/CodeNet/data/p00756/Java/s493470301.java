import java.awt.geom.Point2D;
import java.util.*;

public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		while(true){
			int n = in.nextInt();
			if(n==0)break;
			new AOJ1175().doIt(n);
		}
	}


	class AOJ1175{
		int cnt[][];
		int dfs(long bit,int num){
			if(memo[(int)bit]>=0)return memo[(int)bit];
//			System.out.println(Long.toBinaryString(bit));
			int result = num;
			Arrays.fill(cnt[num/2],0);
			for(int i=0;i<n;i++)for(int s=i-1;s>=0;s--)if((bit>>i)%2==1&&(bit>>s)%2==1){
				if(Point2D.distance(data[i].x, data[i].y, data[s].x, data[s].y)<data[s].r+data[i].r)cnt[num/2][i]++;
			}
			for(int c=1;c<=4;c++){//color
				for(int i=0;i<n;i++)for(int s=i+1;s<n;s++)if(data[i].color==c&&data[s].color==c&&cnt[num/2][i]==0&&cnt[num/2][s]==0){
					if(i==s||((bit>>i)%2==0)||((bit>>s)%2==0))continue;
					bit -= 1 << i;
					bit -= 1 << s;
//					System.out.println(i+" "+s);
					result = Math.max(result, dfs(bit,num+2));
					bit += 1 << i;
					bit += 1 << s;
				}
			}
			return memo[(int)bit] = result;
		}
		int[] memo = new int[(1<<24)];
		int n;
		Data data[];
		void doIt(int n){//<=24
			cnt = new int[24][n];
			Arrays.fill(memo, -1);
			this.n = n;
			data = new Data[n];
			for(int i=0;i<n;i++)data[i] = new Data(in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt());
			long bit=0;
			for(int i=0;i<n;i++)bit += 1 << i;
			int result = dfs(bit,0);
			System.out.println(result);
		}

		class Data{
			int x,y,color,r;
			public Data(int x,int y,int r,int color) {
				this.x = x;
				this.y = y;
				this.r = r;
				this.color = color;
			}
		}
	}


}