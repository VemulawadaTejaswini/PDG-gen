import java.util.*;
public class Main {
	static int cnt=0;
	static int n;
	static void bfs(int a,int b,int c,int day){
		if(a==b&&b==c)return;
		if(day-1==n){
			cnt++;
			return;
		}
		a=b;
		b=c;
		if(hyou[day]>0){
			bfs(a,b,hyou[day],day+1);
		}else{
			for(int i=1;i<=3;i++){
				bfs(a,b,i,day+1);
			}
		}
		return;
	}
	static int hyou[] = new int[101];
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		int k = in.nextInt();
		for(int s=0;s<n;s++)hyou[s]=0;
		int a=0,b=0,c=0;
		boolean z=false,x=false,y=false;
		for(int i=0;i<k;i++){
			int w = in.nextInt();
			hyou[w]=in.nextInt();
			if(w==1){
				a=hyou[w];
				z=true;
			}
			else if(w==2){
				b=hyou[w];
				x=true;
			}
			else if(w==3){
				c=hyou[w];
				y=true;
			}
		}
		for(int s=1;s<=3;s++){
			if(!z)a=s;
			for(int i=1;i<=3;i++){
				if(!x)b=i;
				for(int j=1;j<=3;j++){
					if(!y)c=j;
					bfs(a,b,c,4);
					if(y)break;
				}
				if(x)break;
			}
			if(z)break;
		}
		System.out.println(cnt%10000);
	}
}