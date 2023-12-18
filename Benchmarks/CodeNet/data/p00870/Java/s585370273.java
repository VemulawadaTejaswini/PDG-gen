import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Search of Concatenated Strings
public class Main{

	void run(){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt(), m = sc.nextInt();
			if((n|m)==0)break;
			String[] e = new String[n];
			for(int i=0;i<n;i++)e[i]=sc.next();
			StringBuilder sb = new StringBuilder();
			while(m--!=0)sb.append(sc.next());
			String s = sb.toString();
			int N = s.length();
			boolean[][] t = new boolean[N][n];
			for(int i=0;i<N;i++)for(int j=0;j<n;j++){
				if(s.startsWith(e[j], i))t[i+e[j].length()-1][j] = true;
			}
			List<boolean[]> l = new LinkedList<boolean[]>();
			boolean[] H = new boolean[1<<n];
			H[0] = true;
			l.add(H);
			int res = 0;
			for(int i=0;i<N;i++){
				boolean[] f = new boolean[1<<n];
				f[0] = true;
				for(int S=1;S<1<<n;S++){
					for(int j=0;j<n;j++){
						if(t[i][j]&&((S>>j)&1)>0){
							boolean[] p = l.get(l.size()-e[j].length());
							if(p[S-(1<<j)]){
								f[S] = true; break;
							}
						}
					}
				}
				if(f[(1<<n)-1])res++;
				l.add(f);
				if(20<l.size())l.remove(0);
			}
			System.out.println(res);
		}
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}