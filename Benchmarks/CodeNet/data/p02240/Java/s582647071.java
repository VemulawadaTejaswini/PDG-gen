import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		short[][] a = new short[n][m+1];
		
		//LinkedList<Integer>[] s = new LinkedList[n];
		short u, v;
		
		for(int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			u = Short.parseShort(str[0]);
			v = Short.parseShort(str[1]);
			
			a[u][0] += 1;
			a[u][a[u][0]] = v;
			a[v][0] += 1;
			a[v][a[v][0]] = u;
		}
		
		
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		short[] st = new short[n+100]; // stack
		int p = 0; // stack pointer
		question: for(int i = 0; i < q; i++){
			p = 0;
			str = br.readLine().split(" ");
			boolean[] d = new boolean[n]; 
			st[p] = Short.parseShort(str[0]); // first node
			short frid = Short.parseShort(str[1]); // friend id
			if(st[p] == frid){
				sb.append("yes\n");
				continue question;
			}
			while(p >= 0){
				int pn = st[p]; // present node
				if(d[pn] == false){
					d[pn] = true;
				}
				
				for(int j = a[pn][0]; j > 0; --j){
					if(d[a[pn][j]] == false){
						if(a[pn][j] == frid){
							sb.append("yes\n");
							continue question;
						}
						// push the adjacent nodes
						p += 1;
						st[p] = a[pn][j];
					}
				}

				if(st[p] == pn){
					// pop 
					p -= 1;
				}
			}
			sb.append("no\n");
		}
		
		System.out.print(sb);
	}

}