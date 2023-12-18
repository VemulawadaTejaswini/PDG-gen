import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(true) {
			int t=in.nextInt(),d=in.nextInt(),l=in.nextInt();
			if(t==0)break;
			int cnt=0,time=0;
			for(int i=0;i<t;i++) {
				if(time>=0)time--;
				if(time>=0)cnt++;
				int x=Integer.parseInt(in.next());
				if(x>=l)time=d;
				//System.out.printf("t=%d x=%d time=%d, cnt=%d\n", i,x,time,cnt);
			}
			System.out.println(cnt);
		}
		
	}

}

