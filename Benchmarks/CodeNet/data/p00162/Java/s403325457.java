import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean flg[] = new boolean[1000004];

		flg[1] = true;
		for(int i=1;i<=1000000;i++){
			if(flg[i]){
				if(i*2<=1000000) flg[i*2] = true;
				if(i*3<=1000000) flg[i*3] = true;
				if(i*5<=1000000) flg[i*5] = true;
			}
		}

		while(true){
			int m=sc.nextInt();
			if(m == 0) break;
			int n=sc.nextInt();

			int ans = 0;
			for(int i=m;i<=n;i++) if(flg[i]) ans++;
			System.out.println(ans);
		}
	}
}