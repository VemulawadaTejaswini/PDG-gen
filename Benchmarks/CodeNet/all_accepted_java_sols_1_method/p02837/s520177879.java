import java.io.PrintWriter;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		int N = Integer.parseInt(stdin.next());
		int [][] A= new int[N][N];
		int ans=0;
		
		for(int i=0;i<N;++i) {
			for(int j=0;j<N;++j) {
				A[i][j] = -1;
			}
		}

		for(int i=0;i<N;i++) {
			int annum=Integer.parseInt(stdin.next());
			for(int j=0;j<annum;j++) {
				int x=Integer.parseInt(stdin.next());
				int y=Integer.parseInt(stdin.next());
				A[i][x-1]=y;
			}
		}
		for(int i=0;i<(1<<N);i++) {
			boolean ok=true;
			for(int j=0;j<N;j++) {
				if((i&(1<<j))==0) {
					continue;
				}
				for(int k=0;k<N;k++) {
					if(A[j][k]==-1) {
						continue;
					}
					if(A[j][k]!=(((i&(1<<k))==0)?0:1)) {
						ok=false;
					}
				}
				if(ok==false) {
					break;
				}
			}
			if(ok==false) {
				continue;
			}
			int max=0;
			for(int l=0;l<N;l++) {
				if((i&(1<<l))!=0) {
					max+=1;
				}
			}
			if(ans<max) {
				ans=max;
			}
		}
		out.println(ans);
		out.flush();
	}
}