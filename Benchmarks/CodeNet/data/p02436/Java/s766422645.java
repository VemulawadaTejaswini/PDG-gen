import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] Q = new ArrayList[n];
		for(int i = 0; i < n; i++) Q[i] = new ArrayList<Integer>();
		for(int i = 0; i < q; i++){
			str = br.readLine().split(" ");
			int op = Integer.parseInt(str[0]);
			if(op == 0){
				int t = Integer.parseInt(str[1]);
				int x = Integer.parseInt(str[2]);
				Q[t].add(x);
			}else if(op == 1){
				int t = Integer.parseInt(str[1]);
				if(Q[t].isEmpty()) continue;
				System.out.println(Q[t].get(0));
			}else{
				int t = Integer.parseInt(str[1]);
				if(Q[t].isEmpty()) continue;
				Q[t].remove(0);
			}
		}
	}
}

