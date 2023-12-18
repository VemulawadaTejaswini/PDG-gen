import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			boolean[][] e = new boolean[n][n+1];
			for(int i=0;i<n;i++){
				int m = sc.nextInt();
				while(m--!=0)e[i][sc.nextInt()]=true;
			}
			boolean[] f = new boolean[n+1];
			int K = sc.nextInt();
			while(K--!=0)f[sc.nextInt()]=true;
			List<Integer> l = new ArrayList<Integer>();
			for(int i=0;i<n;i++){
				boolean ok = true;
				for(int j=1;j<=n;j++)if(f[j]&&!e[i][j])ok=false;
				if(ok)l.add(i+1);
			}
			System.out.println(l.isEmpty()||l.size()>1?-1:l.get(0));
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}