import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		BitSet bs = new BitSet(n);
		str = br.readLine().split(" ");
		int k = Integer.parseInt(str[0]);
		for(int i = 0; i < k; i++){
			int b = Integer.parseInt(str[i + 1]);
			bs.set(b);
		}
		for(int i = 0; i < (1 << n); i++){
			boolean flag = true;
			for(int j = 0; j < n; j++){
				if(!bs.get(j)) continue;
				if((i & (1 << j)) == 0) flag = false;
			}
			if(!flag) continue;
			int sum = 0;
			int pow2 = 1;
			ArrayList<Integer> a = new ArrayList<Integer>();
			for(int j = 0; j < n; j++){
				if((i & (1 << j)) != 0){
					sum += pow2;
					a.add(j);
				}
				pow2 *= 2;
			}
			pw.print(sum + ":");
			if(i > 0) pw.print(" ");
			for(int j = 0; j < a.size(); j++){
				pw.print(a.get(j));
				if(j != a.size() - 1) pw.print(" ");
			}
			pw.print("\n");
		}
		pw.close();
	}
}

