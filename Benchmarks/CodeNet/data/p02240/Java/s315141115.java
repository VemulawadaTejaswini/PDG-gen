import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		
		List<List<Integer>> a = new Vector<List<Integer>>(n);
		for(int i = 0; i < n; ++i) {
			a.add(new LinkedList<Integer>());
		}
		
		int u, v;
		for(int i = 0; i < m; i++) {
			str = br.readLine().split(" ");
			u = Integer.parseInt(str[0]);
			v = Integer.parseInt(str[1]);
			
			a.get(u).add(v);
			a.get(v).add(u);
		}
		//return;
		
		int q = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		ArrayDeque<Integer> st = new ArrayDeque<Integer>();
		
		question: for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			boolean[] d = new boolean[n]; 
			st.clear();
			st.push(Integer.parseInt(str[0])); // first node
			Integer frid = Integer.parseInt(str[1]); // friend id

			while(st.size() > 0){
				for(Integer node: a.get(st.pop())){
					if(d[node] == false){
						if(node.equals(frid)){
							sb.append("yes\n");
							continue question;
						}
						// push the adjacent nodes
						d[node] = true;
						st.push(node);
					}
				}
			}
			sb.append("no\n");
		}
		
		System.out.print(sb);
	}

}